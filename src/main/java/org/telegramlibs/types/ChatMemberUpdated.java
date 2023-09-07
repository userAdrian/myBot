package org.telegramlibs.types;

public class ChatMemberUpdated {
    private Chat chat;
    private User from;
    private String date;
    private ChatMember old_chat_member;
    private ChatMember new_chat_member;
    private ChatInviteLink invite_link;
    private boolean via_chat_folder_invite_link;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ChatMember getOld_chat_member() {
        return old_chat_member;
    }

    public void setOld_chat_member(ChatMember old_chat_member) {
        this.old_chat_member = old_chat_member;
    }

    public ChatMember getNew_chat_member() {
        return new_chat_member;
    }

    public void setNew_chat_member(ChatMember new_chat_member) {
        this.new_chat_member = new_chat_member;
    }

    public ChatInviteLink getInvite_link() {
        return invite_link;
    }

    public void setInvite_link(ChatInviteLink invite_link) {
        this.invite_link = invite_link;
    }

    public boolean isVia_chat_folder_invite_link() {
        return via_chat_folder_invite_link;
    }

    public void setVia_chat_folder_invite_link(boolean via_chat_folder_invite_link) {
        this.via_chat_folder_invite_link = via_chat_folder_invite_link;
    }
}
