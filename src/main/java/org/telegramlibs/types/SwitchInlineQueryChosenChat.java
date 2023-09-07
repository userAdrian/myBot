package org.telegramlibs.types;

public class SwitchInlineQueryChosenChat implements java.io.Serializable {
    private String query;
    private boolean allow_user_chats;
    private boolean allow_bot_chats;
    private boolean allow_group_chats;
    private boolean allow_channel_chats;
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isAllow_user_chats() {
        return allow_user_chats;
    }

    public void setAllow_user_chats(boolean allow_user_chats) {
        this.allow_user_chats = allow_user_chats;
    }

    public boolean isAllow_bot_chats() {
        return allow_bot_chats;
    }

    public void setAllow_bot_chats(boolean allow_bot_chats) {
        this.allow_bot_chats = allow_bot_chats;
    }

    public boolean isAllow_group_chats() {
        return allow_group_chats;
    }

    public void setAllow_group_chats(boolean allow_group_chats) {
        this.allow_group_chats = allow_group_chats;
    }

    public boolean isAllow_channel_chats() {
        return allow_channel_chats;
    }

    public void setAllow_channel_chats(boolean allow_channel_chats) {
        this.allow_channel_chats = allow_channel_chats;
    }
}
