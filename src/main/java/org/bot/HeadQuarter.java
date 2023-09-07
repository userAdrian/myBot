package org.bot;


import org.jetbrains.annotations.NotNull;
import org.telegramlibs.types.*;
import org.telegramlibs.Utilities;

import java.io.File;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import org.slf4j.*;

/**
 * This bot will send a motivational phrase 3 times per day
 */
public class HeadQuarter extends Thread {
    private static final Logger logger = LoggerFactory.getLogger(HeadQuarter.class);
    private static final String MORNING = "09:00"; //"hours:minutes", time at which send the phrase
    private static final String AFTERNOON = "14:00"; //"hours:minutes", time at which send the phrase
    private static final String EVENING = "20:00"; //"hours:minutes", time at which send the phrase
    private static final TimeZone TIMEZONE = TimeZone.getTimeZone("Europe/Rome"); //timezone set
    private static final long COOLDOWN = 43200000; //cooldown for '/randomPhrase'
    private static final long PERIOD = 86400000;
    private Map<String,Chat> chats = new HashMap<>(); //Map<chat_id,Chat>
    private Map<Chat, List<Message>> messages = new HashMap<>(); //store all messages from a chat
    private Map<String,Person> persons = new HashMap<>(); //Map<user_id,Person>
    private Utilities utilities = new Utilities();
    private List<Phrase> phrases = new ArrayList<>();
    private List<String> admins = new ArrayList<>(); //List<chat_id>
    private Map<String, PhotoSize> photos = new HashMap<>();
    private Timer timer = new Timer();

    public HeadQuarter(){
     }

    /**
     * Setting the admin(s), timer task phrases and upload the photos to telegram server
     */
    @Override
    public void run() {
        logger.info("Starting headquarter");
        logger.info("Setting desired timezone: " + TIMEZONE);
        TimeZone.setDefault(TIMEZONE);
        logger.info("Setting timer task phrases");
        this.schedulePhrasesTask(getPhrasesDates());
        logger.info("Loading phrases from file");
        phrases = readFilePhrases();
        logger.info("Start looking for updates...");
        timer.scheduleAtFixedRate(getStoreTask(), 600000, 600000); //store objects every 10 minutes
        this.loadObject(); //load objects previous stored, if not present throws a FileNotFoundException and continue

        while(true){
            List<Update> list = utilities.getUpdates();
            for(Update u : list) {
               if(u.getMessage() != null){
                   this.handleMessage(u.getMessage());
               } else if(u.getCallback_query() != null){
                   this.handleCallbackQuery(u.getCallback_query());
               } else if(u.getMy_chat_member() != null){
                   this.handleChatMemberUpdated(u.getMy_chat_member());
               }
            }
        }
    }

    /**
     * Get a task that calls {@link HeadQuarter#storeObjects()}.
     * @return {@code TimerTask} object
     */
    private TimerTask getStoreTask(){
        return new TimerTask(){
            @Override
            public void run(){
                storeObjects();
            }
        };
    }

    /**
     * Serialize {@code chats}, {@code messages}, {@code persons} objects and store them in a file.
     */
    private void storeObjects(){
        try{
            FileOutputStream f = new FileOutputStream("myObject");
            ObjectOutputStream out = new ObjectOutputStream(f);
            List<Object> list = new ArrayList<>();
            list.add(chats);
            list.add(messages);
            list.add(persons);
            out.writeObject(list);
            out.close();
            f.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Deserialize {@code chats}, {@code messages}, {@code persons} objects from a file.
     */
    private void loadObject(){
        try{
            FileInputStream f = new FileInputStream("myObject");
            ObjectInputStream in = new ObjectInputStream(f);

            List<Object> list = (List<Object>) in.readObject();
            chats =  (HashMap)list.get(0);
            messages = (HashMap) list.get(1);
            persons = (HashMap) list.get(2);
            in.close();
            f.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
            logger.error("Trying to load objects from file " + e.getClass());
        }
    }

    /**
     * Handle a message.
     * @param m message to be parsed
     */
    private void handleMessage(Message m){
        this.addMessage(m);
        String text = m.getText();
        String chat_id = m.getChat().getId();
        String[] array;
        switch (text) {
            case ("/start"):
                array = this.welcomeMessage(m.getFrom().getFirst_name());
                this.sendMessagePhoto(chat_id, array[0], "welcome.webp", array[1]);
                break;
            case ("/reloadFilePhrases"):
                if (admins.contains(m.getFrom().getId()))
                    phrases = readFilePhrases();
                    utilities.sendMessage(chat_id, "File reloaded");
                break;
            case ("/randomPhrase"):
                Person p = persons.get(m.getFrom().getId());
                long time_now = Calendar.getInstance().getTimeInMillis();
                long dif = time_now - p.getCooldown();
                Date date = new Date(time_now + dif);

                if(dif > 0) {
                    p.setCooldown(time_now + COOLDOWN);
                    utilities.sendMessage(chat_id, p.getRandomPhrase());
                }else{
                    utilities.sendMessage(chat_id, "This command is on cooldown until " + date);
                }
                break;
        }
    }

    /**
     * Handle a callback query.
     * @param c callback query to be parsed
     */
    private void handleCallbackQuery(CallbackQuery c){
        String text = c.getData();
        String[] array;
        String chat_id = c.getMessage().getChat().getId();
        switch (text){
            case "page_one":
                array = this.pageOne();
                utilities.deleteMessage(chat_id, c.getMessage().getMessage_id());
                utilities.sendMessage(chat_id, array[0], array[1]);
                break;
            case "welcome_message":
                array = this.welcomeMessage(c.getFrom().getFirst_name());
                utilities.deleteMessage(chat_id, c.getMessage().getMessage_id());
                this.sendMessagePhoto(chat_id, array[0], "welcome.webp", array[1]);
                break;
            case "page_statistics":
                Person p = persons.get(c.getFrom().getId());
                if(p != null){
                    array = this.pageStatistics(p);
                    utilities.deleteMessage(chat_id, c.getMessage().getMessage_id());
                    utilities.sendMessage(chat_id, array[0], array[1]);
                }
                break;
        }
    }

    /**
     * Handle a {@code ChatMemberUpdated} update.
     * @param c the {@code ChatMemberUpdated} object.
     */
    private void handleChatMemberUpdated(ChatMemberUpdated c){
        String status = c.getNew_chat_member().getStatus();
        User user = c.getFrom();
        if(status.equals("kicked")){
            if(persons.containsKey(user.getId()))
                persons.get(user.getId()).setBanned(true);
        } else if(status.equals("member")){
            if(persons.containsKey(user.getId()))
                persons.get(user.getId()).setBanned(false);
        }
    }

    /**
     * Send a message with photo. For the first time send the file, in the following times use its id.
     * @param chat_id of the {@code Chat}
     * @param caption to send.
     * @param photo_name of the file.
     * @param reply_markup serialized buttons.
     */
    private void sendMessagePhoto(String chat_id, String caption, String photo_name, String reply_markup){
        if(photos.containsKey(photo_name)){
            utilities.sendPhoto(chat_id, caption, photos.get(photo_name), reply_markup);
        }else{
            photos.put(photo_name, utilities.sendPhoto(chat_id, caption, new File(photo_name), reply_markup));
        }
    }

    /**
     * Adding a new chat to {@link #chats} map if not already exist.<br>
     * Creating a new {@code Person} related to it and store in {@link #persons} map.<br>
     * Adding a message to {@link #messages} map.
     * @param m message to be added
     */
    private void addMessage(Message m){
            String chat_id = m.getChat().getId();
            if (!chats.containsKey(chat_id)) {
                chats.put(chat_id, m.getChat());
                persons.put(m.getFrom().getId(),new Person(m.getFrom(),
                        m.getChat(),
                        getPhrasesIndex(phrases),
                        phrases));
            }
            Chat c = chats.get(chat_id);
            if (!messages.containsKey(c))
                messages.put(c, new ArrayList<>());
            messages.get(c).add(m);
    }

    /**
     * Create the phrases task: send a random phrase to all persons.
     * @return a {@code TimerTask}
     */
    private TimerTask getPhrasesTask(){
        return new TimerTask(){
            @Override
            public void run(){
                for(Person p : persons.values())
                    if(!p.isBanned())
                        utilities.sendMessage(p.getChat().getId(), p.getRandomPhrase());
            }
        };
    }

    /**
     *  Schedule the phrases task
     * @param dates hours in which send the phrases
     */
    private void schedulePhrasesTask(Date[] dates){
        timer.scheduleAtFixedRate(this.getPhrasesTask(), dates[0], PERIOD);
        timer.scheduleAtFixedRate(this.getPhrasesTask(), dates[1], PERIOD);
        timer.scheduleAtFixedRate(this.getPhrasesTask(), dates[2], PERIOD);
    }

    /**
     * Get the correct dates for schedule the phrases task. To generate them the method uses the variables {@link #MORNING},
     * {@link #AFTERNOON}, {@link #EVENING}.
     * @return dates to use in {@link org.bot.HeadQuarter#schedulePhrasesTask(Date[])}
     */
    private static Date[] getPhrasesDates(){
        Calendar now = Calendar.getInstance();
        Calendar[] calendars = new Calendar[3];
        calendars[0] = getCalendar(MORNING.split(":"));
        calendars[1] = getCalendar(AFTERNOON.split(":"));
        calendars[2] = getCalendar(EVENING.split(":"));

            if(now.compareTo(calendars[0]) < 0){
                return getDatesFromCalendars(calendars);
            }else if(now.compareTo(calendars[1]) < 0){
                calendars[0].add(Calendar.DAY_OF_MONTH, 1);
            }else if(now.compareTo(calendars[2]) < 0){
                calendars[0].add(Calendar.DAY_OF_MONTH, 1);
                calendars[1].add(Calendar.DAY_OF_MONTH, 1);
            }else{
                calendars[0].add(Calendar.DAY_OF_MONTH, 1);
                calendars[1].add(Calendar.DAY_OF_MONTH, 1);
                calendars[2].add(Calendar.DAY_OF_MONTH, 1);
            }
        return getDatesFromCalendars(calendars);
    }

    /**
     * Get a {@code Calendar} with hours and minutes set.
     * @param array of string {hours, minutes}
     * @return a {@code Calendar} object
     */
    private static Calendar getCalendar(String[] array){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(array[0]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(array[1]));

        return calendar;
    }

    /**
     * Convert an array of {@code Calendar} to an array of {@code Date}.
     * @param calendars array of {@code Calendar}
     * @return an array of {@code Date}
     */
    private static Date[] getDatesFromCalendars(Calendar[] calendars){
        Date[] dates = new Date[calendars.length];
        for(int i=0; i<3; i++){
            dates[i] = calendars[i].getTime();
        }
        return dates;
    }
    /**
     *
     * @param phrases the list of all phrases available
     * @return a list of indexes related to {@code phrases}
     */
    public static List<Integer> getPhrasesIndex(List<Phrase> phrases){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< phrases.size(); i++){
            list.add(i);
        }
        return list;
    }

    /**
     * Read the phrases from the file
     * @return a list of string read or an empty list if an IOException occurred
     */
    private static List<Phrase> readFilePhrases(){
        try{
            FileReader file_reader = new FileReader("phrases_list.txt");
            BufferedReader reader = new BufferedReader(file_reader);
            List<String> list = reader.lines().toList();
            reader.close();
            file_reader.close();
            //format phrase on file "text"\!\"-author"
            return list.stream()
                    .map(s -> {
                        String[] array = s.split("/!/-");
                        return (array.length == 2) ? new Phrase(array[0], array[1]) : null;
                    }).filter(t -> t != null)
                    .collect(Collectors.toList());
        }catch(IOException e){
            logger.error("Reading phrases from file");
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    /**
     * Generate a welcome message with buttons.
     * @param name first name of the user
     * @return a string array {text message, serialized buttons}
     */
    private String[] welcomeMessage(String name){
        String text = "Ciao " + name +", il mio nome è Bi-Bot. Sono stato creato con lo scopo di tenerti alta la motivazione e aiutarti a raggiungere i tuoi obiettivi!";
        InlineKeyboardButton b1 = new InlineKeyboardButton("Info","page_one");
        InlineKeyboardButton b2 = new InlineKeyboardButton("Statistiche","page_statistics");
        InlineKeyboardButton[][] buttons = {{b1},{b2}};
        InlineKeyboardMarkup m = new InlineKeyboardMarkup(buttons);
        return new String[]{text, utilities.serialize(m)};
    }

    /**
     * Generate the page one called "Info"
     * @return a string array {text message, serialized buttons}
     */
    private String[] pageOne(){
        String text = "Ogni giorno ti invierò una frase per cercare di mantenere o incrementare la tua motivazione!\n" +
                "Gli orari a cui riceverai un mio messaggio saranno: " + MORNING + ", " + AFTERNOON + ", " + EVENING;
        InlineKeyboardButton b1 = new InlineKeyboardButton("Precedente","welcome_message");
        InlineKeyboardButton[][] buttons = {{b1}};
        InlineKeyboardMarkup m = new InlineKeyboardMarkup(buttons);
        return new String[]{text, utilities.serialize(m)};
    }

    /**
     * Generate the statistics page.
     * @param p {@code Person} who requested the statistics
     * @return a string array {statistics, serialized buttons}
     */
    private String[] pageStatistics(Person p){
        StringBuilder text = new StringBuilder("Queste sono le tue statistiche:\n");
        text.append("- Frasi totali: ").append(p.getStatistics().getTotal_phrases()).append("\n");
        text.append("- Autore più visto: ").append(p.getStatistics().mostViewedAuthor()).append("\n");
        text.append("- Autore meno visto: ").append(p.getStatistics().lessViewedAuthor());
        InlineKeyboardButton b1 = new InlineKeyboardButton("Precedente","welcome_message");
        InlineKeyboardButton[][] buttons = {{b1}};
        InlineKeyboardMarkup m = new InlineKeyboardMarkup(buttons);
        return new String[]{text.toString(), utilities.serialize(m)};
    }

}

