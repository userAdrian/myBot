package org.bot;

import java.util.*;
import org.telegramlibs.types.*;

public class Person implements java.io.Serializable{
    private User user;
    private Chat chat;
    private List<Integer> phrases_index; //phrases indexes
    private List<Phrase> phrases;
    private boolean banned = false;
    private long cooldown = 0L;
    private Statistics statistics = new Statistics();

    public Person (){};

    public Person(User user, Chat chat, List<Integer> phrases_index, List<Phrase> phrases){
        this.user = user;
        this.chat = chat;
        this.phrases_index = phrases_index;
        this.phrases = phrases;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public List<Integer> getPhrases_index() {
        return phrases_index;
    }

    public void setPhrases_index(List<Integer> phrases_index) {
        this.phrases_index = phrases_index;
    }

    public Statistics getStatistics(){
        return this.statistics;
    }

    /**
     * Get a random phrase and remove it from {@code phrases_index}
     * @return a phrase
     */
    public String getRandomPhrase(){
        Random r = new Random(System.currentTimeMillis());
        int index;
        int number_phrase;
        do{
            index = r.nextInt(phrases_index.size());
            number_phrase = phrases_index.get(index);
            phrases_index.remove(index);
            //reload phrases_index if there is no more
            if(phrases_index.isEmpty())
                phrases_index = HeadQuarter.getPhrasesIndex(phrases);
        }while(number_phrase >= phrases.size()); //check if number_phrase falls within phrases indexes to avoid IndexOutOfBoundsException

        statistics.setTotal_phrases(statistics.getTotal_phrases() + 1); //total phrases sent
        statistics.putAuthor(phrases.get(number_phrase).getAuthor());
        return phrases.get(number_phrase).toString();
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public long getCooldown() {
        return cooldown;
    }

    public void setCooldown(long cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * Define the statistics related to a person
     */
    public class Statistics implements java.io.Serializable{
        private Integer total_phrases;
        //Map<author_name,counter about how many times has been sent>
        private Map<String,Integer> author_counter = new HashMap<>();
        public Integer getTotal_phrases() {
            return (total_phrases == null) ? 0 : total_phrases;
        }

        public void setTotal_phrases(Integer total_phrases) {
            this.total_phrases = total_phrases;
        }

        /**
         * Put an author in the {@code author_counter} map and increment his counter by one.
         * @param author of the phrase
         */
        public void putAuthor(String author){
            Integer counter = author_counter.get(author);
            if(counter == null) {
                author_counter.put(author, 1);
            }else{
                author_counter.put(author, counter + 1);
            }
        }

        /**
         * Get the most viewed author.
         * @return the most viewed author. If more authors have the same counter value, return only one of them.
         */
        public String mostViewedAuthor(){
            Map.Entry<String,Integer> author = getEntry(author_counter.keySet().size() - 1);
            return (author == null) ? "assente" : author.getKey();
        }
        /**
         * Get the less viewed author.
         * @return the less viewed author. If more authors have the same counter value, return only one of them.
         */
        public String lessViewedAuthor(){
            Map.Entry<String,Integer> author = getEntry(0);
            return (author == null) ? "assente" : author.getKey();
        }

        /**
         * Sort the {@code author_counter} by values.
         * @param index of the author that want to get
         * @return a {@code Map.Entry} from author_counter
         */
        private Map.Entry<String,Integer> getEntry(int index){
            List<Map.Entry<String,Integer>> list = new ArrayList<>(author_counter.entrySet());
            list.sort(Map.Entry.comparingByValue());
            System.out.println("Index: " + index + list);
            return (list.isEmpty()) ? null : list.get(index);
        }
    }
}
