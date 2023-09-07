package org.telegramlibs.types;

import java.util.*;
public class Message implements java.io.Serializable{
    private String message_id;
    private String message_thread_id;
    private User from;
    private Chat sender_chat;
    private String date;
    private Chat chat;
    private User forward_from;
    private Chat forward_from_chat;
    private String forward_from_message_id;
    private String forward_signature;
    private String forward_sender_name;
    private String forward_date;
    private boolean is_topic_message;
    private boolean is_automatic_forward;
    private Message reply_to_message;
    private User via_bot;
    private boolean has_protected_content;
    private String media_group_id;
    private String author_signature;
    private String text;
    private List<MessageEntity> entities;
    private Animation animation;
    private Audio audio;
    private Document document;
    private List<PhotoSize> photo;
    private Sticker sticker;
    private Story story;
    private Video video;
    private VideoNote video_note;
    private Voice voice;
    private String caption;
    private List<MessageEntity> caption_entities;
    private boolean has_media_spoiler;
    private Contact contact;
    private Dice dice;
    private Game game;
    private Poll poll;
    private Venue venue;
    private Location location;
    private List<User> new_chat_members;
    private User left_chat_member;
    private String new_chat_title;
    private List<PhotoSize> new_chat_photo;
    private boolean delete_chat_photo;
    private boolean group_chat_created;
    private boolean supergroup_chat_created;
    private boolean channel_chat_created;
    private MessageAutoDeleteTimerChanged message_auto_delete_timer_changed;
    private String migrate_to_chat_id;
    private String migrate_from_chat_id;
    private Message pinned_message;
    private Invoice invoice;
    private SuccessfulPayment successful_payment;
    private UserShared user_shared;
    private ChatShared chat_shared;
    private String connected_website;
    private WriteAccessAllowed write_access_allowed;
    private PassportData passport_data;
    private ProximityAlertTriggered proximity_alert_triggered;
    private ForumTopicEdited forum_topic_edited;
    private ForumTopicClosed forum_topic_closed;
    private ForumTopicReopened forum_topic_reopened;
    private GeneralForumTopicHidden general_forum_topic_hidden;
    private GeneralForumTopicUnhidden general_forum_topic_unhidden;
    private VideoChatScheduled video_chat_scheduled;
    private VideoChatStarted video_chat_started;
    private VideoChatEnded video_chat_ended;
    private VideoChatParticipantsInvited vide_chat_participants_invited;
    private WebAppData web_app_data;
    private InlineKeyboardMarkup reply_markup;

    public String getMessage_id() {
        return message_id;
    }

    public void setMessage_id(String message_id) {
        this.message_id = message_id;
    }

    public String getMessage_thread_id() {
        return message_thread_id;
    }

    public void setMessage_thread_id(String message_thread_id) {
        this.message_thread_id = message_thread_id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Chat getSender_chat() {
        return sender_chat;
    }

    public void setSender_chat(Chat sender_chat) {
        this.sender_chat = sender_chat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getForward_from() {
        return forward_from;
    }

    public void setForward_from(User forward_from) {
        this.forward_from = forward_from;
    }

    public Chat getForward_from_chat() {
        return forward_from_chat;
    }

    public void setForward_from_chat(Chat forward_from_chat) {
        this.forward_from_chat = forward_from_chat;
    }

    public String getForward_from_message_id() {
        return forward_from_message_id;
    }

    public void setForward_from_message_id(String forward_from_message_id) {
        this.forward_from_message_id = forward_from_message_id;
    }

    public String getForward_signature() {
        return forward_signature;
    }

    public void setForward_signature(String forward_signature) {
        this.forward_signature = forward_signature;
    }

    public String getForward_sender_name() {
        return forward_sender_name;
    }

    public void setForward_sender_name(String forward_sender_name) {
        this.forward_sender_name = forward_sender_name;
    }

    public String getForward_date() {
        return forward_date;
    }

    public void setForward_date(String forward_date) {
        this.forward_date = forward_date;
    }

    public boolean isIs_topic_message() {
        return is_topic_message;
    }

    public void setIs_topic_message(boolean is_topic_message) {
        this.is_topic_message = is_topic_message;
    }

    public boolean isIs_automatic_forward() {
        return is_automatic_forward;
    }

    public void setIs_automatic_forward(boolean is_automatic_forward) {
        this.is_automatic_forward = is_automatic_forward;
    }

    public Message getReply_to_message() {
        return reply_to_message;
    }

    public void setReply_to_message(Message reply_to_message) {
        this.reply_to_message = reply_to_message;
    }

    public User getVia_bot() {
        return via_bot;
    }

    public void setVia_bot(User via_bot) {
        this.via_bot = via_bot;
    }

    public boolean isHas_protected_content() {
        return has_protected_content;
    }

    public void setHas_protected_content(boolean has_protected_content) {
        this.has_protected_content = has_protected_content;
    }

    public String getMedia_group_id() {
        return media_group_id;
    }

    public void setMedia_group_id(String media_group_id) {
        this.media_group_id = media_group_id;
    }

    public String getAuthor_signature() {
        return author_signature;
    }

    public void setAuthor_signature(String author_signature) {
        this.author_signature = author_signature;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public VideoNote getVideo_note() {
        return video_note;
    }

    public void setVideo_note(VideoNote video_note) {
        this.video_note = video_note;
    }

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<MessageEntity> getCaption_entities() {
        return caption_entities;
    }

    public void setCaption_entities(List<MessageEntity> caption_entities) {
        this.caption_entities = caption_entities;
    }

    public boolean isHas_media_spoiler() {
        return has_media_spoiler;
    }

    public void setHas_media_spoiler(boolean has_media_spoiler) {
        this.has_media_spoiler = has_media_spoiler;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<User> getNew_chat_members() {
        return new_chat_members;
    }

    public void setNew_chat_members(List<User> new_chat_members) {
        this.new_chat_members = new_chat_members;
    }

    public User getLeft_chat_member() {
        return left_chat_member;
    }

    public void setLeft_chat_member(User left_chat_member) {
        this.left_chat_member = left_chat_member;
    }

    public String getNew_chat_title() {
        return new_chat_title;
    }

    public void setNew_chat_title(String new_chat_title) {
        this.new_chat_title = new_chat_title;
    }

    public List<PhotoSize> getNew_chat_photo() {
        return new_chat_photo;
    }

    public void setNew_chat_photo(List<PhotoSize> new_chat_photo) {
        this.new_chat_photo = new_chat_photo;
    }

    public boolean isDelete_chat_photo() {
        return delete_chat_photo;
    }

    public void setDelete_chat_photo(boolean delete_chat_photo) {
        this.delete_chat_photo = delete_chat_photo;
    }

    public boolean isGroup_chat_created() {
        return group_chat_created;
    }

    public void setGroup_chat_created(boolean group_chat_created) {
        this.group_chat_created = group_chat_created;
    }

    public boolean isSupergroup_chat_created() {
        return supergroup_chat_created;
    }

    public void setSupergroup_chat_created(boolean supergroup_chat_created) {
        this.supergroup_chat_created = supergroup_chat_created;
    }

    public boolean isChannel_chat_created() {
        return channel_chat_created;
    }

    public void setChannel_chat_created(boolean channel_chat_created) {
        this.channel_chat_created = channel_chat_created;
    }

    public MessageAutoDeleteTimerChanged getMessage_auto_delete_timer_changed() {
        return message_auto_delete_timer_changed;
    }

    public void setMessage_auto_delete_timer_changed(MessageAutoDeleteTimerChanged message_auto_delete_timer_changed) {
        this.message_auto_delete_timer_changed = message_auto_delete_timer_changed;
    }

    public String getMigrate_to_chat_id() {
        return migrate_to_chat_id;
    }

    public void setMigrate_to_chat_id(String migrate_to_chat_id) {
        this.migrate_to_chat_id = migrate_to_chat_id;
    }

    public String getMigrate_from_chat_id() {
        return migrate_from_chat_id;
    }

    public void setMigrate_from_chat_id(String migrate_from_chat_id) {
        this.migrate_from_chat_id = migrate_from_chat_id;
    }

    public Message getPinned_message() {
        return pinned_message;
    }

    public void setPinned_message(Message pinned_message) {
        this.pinned_message = pinned_message;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public SuccessfulPayment getSuccessful_payment() {
        return successful_payment;
    }

    public void setSuccessful_payment(SuccessfulPayment successful_payment) {
        this.successful_payment = successful_payment;
    }

    public UserShared getUser_shared() {
        return user_shared;
    }

    public void setUser_shared(UserShared user_shared) {
        this.user_shared = user_shared;
    }

    public ChatShared getChat_shared() {
        return chat_shared;
    }

    public void setChat_shared(ChatShared chat_shared) {
        this.chat_shared = chat_shared;
    }

    public String getConnected_website() {
        return connected_website;
    }

    public void setConnected_website(String connected_website) {
        this.connected_website = connected_website;
    }

    public WriteAccessAllowed getWrite_access_allowed() {
        return write_access_allowed;
    }

    public void setWrite_access_allowed(WriteAccessAllowed write_access_allowed) {
        this.write_access_allowed = write_access_allowed;
    }

    public PassportData getPassport_data() {
        return passport_data;
    }

    public void setPassport_data(PassportData passport_data) {
        this.passport_data = passport_data;
    }

    public ProximityAlertTriggered getProximity_alert_triggered() {
        return proximity_alert_triggered;
    }

    public void setProximity_alert_triggered(ProximityAlertTriggered proximity_alert_triggered) {
        this.proximity_alert_triggered = proximity_alert_triggered;
    }

    public ForumTopicEdited getForum_topic_edited() {
        return forum_topic_edited;
    }

    public void setForum_topic_edited(ForumTopicEdited forum_topic_edited) {
        this.forum_topic_edited = forum_topic_edited;
    }

    public ForumTopicClosed getForum_topic_closed() {
        return forum_topic_closed;
    }

    public void setForum_topic_closed(ForumTopicClosed forum_topic_closed) {
        this.forum_topic_closed = forum_topic_closed;
    }

    public ForumTopicReopened getForum_topic_reopened() {
        return forum_topic_reopened;
    }

    public void setForum_topic_reopened(ForumTopicReopened forum_topic_reopened) {
        this.forum_topic_reopened = forum_topic_reopened;
    }

    public GeneralForumTopicHidden getGeneral_forum_topic_hidden() {
        return general_forum_topic_hidden;
    }

    public void setGeneral_forum_topic_hidden(GeneralForumTopicHidden general_forum_topic_hidden) {
        this.general_forum_topic_hidden = general_forum_topic_hidden;
    }

    public GeneralForumTopicUnhidden getGeneral_forum_topic_unhidden() {
        return general_forum_topic_unhidden;
    }

    public void setGeneral_forum_topic_unhidden(GeneralForumTopicUnhidden general_forum_topic_unhidden) {
        this.general_forum_topic_unhidden = general_forum_topic_unhidden;
    }

    public VideoChatScheduled getVideo_chat_scheduled() {
        return video_chat_scheduled;
    }

    public void setVideo_chat_scheduled(VideoChatScheduled video_chat_scheduled) {
        this.video_chat_scheduled = video_chat_scheduled;
    }

    public VideoChatStarted getVideo_chat_started() {
        return video_chat_started;
    }

    public void setVideo_chat_started(VideoChatStarted video_chat_started) {
        this.video_chat_started = video_chat_started;
    }

    public VideoChatEnded getVideo_chat_ended() {
        return video_chat_ended;
    }

    public void setVideo_chat_ended(VideoChatEnded video_chat_ended) {
        this.video_chat_ended = video_chat_ended;
    }

    public VideoChatParticipantsInvited getVide_chat_participants_invited() {
        return vide_chat_participants_invited;
    }

    public void setVide_chat_participants_invited(VideoChatParticipantsInvited vide_chat_participants_invited) {
        this.vide_chat_participants_invited = vide_chat_participants_invited;
    }

    public WebAppData getWeb_app_data() {
        return web_app_data;
    }

    public void setWeb_app_data(WebAppData web_app_data) {
        this.web_app_data = web_app_data;
    }

    public InlineKeyboardMarkup getReply_markup() {
        return reply_markup;
    }

    public void setReply_markup(InlineKeyboardMarkup reply_markup) {
        this.reply_markup = reply_markup;
    }
}
