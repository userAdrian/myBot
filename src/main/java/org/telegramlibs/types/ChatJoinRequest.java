package org.telegramlibs.types;

public class ChatJoinRequest implements java.io.Serializable {
    private Chat chat;
    private User from;
    private String user_chat_id;
    private String date;
    private String bio;
    private ChatInviteLink invite_link;

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public String getUser_chat_id() {
        return user_chat_id;
    }

    public void setUser_chat_id(String user_chat_id) {
        this.user_chat_id = user_chat_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public ChatInviteLink getInvite_link() {
        return invite_link;
    }

    public void setInvite_link(ChatInviteLink invite_link) {
        this.invite_link = invite_link;
    }
}
