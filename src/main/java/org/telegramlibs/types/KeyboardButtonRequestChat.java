package org.telegramlibs.types;

public class KeyboardButtonRequestChat implements java.io.Serializable {
    private String request_id;
    private boolean chat_is_channel;
    private boolean chat_is_forum;
    private boolean chat_has_username;
    private boolean chat_is_created;
    private ChatAdministratorRights user_administrator_rights;
    private ChatAdministratorRights bot_administrator_rights;
    private boolean bot_is_member;

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public boolean isChat_is_channel() {
        return chat_is_channel;
    }

    public void setChat_is_channel(boolean chat_is_channel) {
        this.chat_is_channel = chat_is_channel;
    }

    public boolean isChat_is_forum() {
        return chat_is_forum;
    }

    public void setChat_is_forum(boolean chat_is_forum) {
        this.chat_is_forum = chat_is_forum;
    }

    public boolean isChat_has_username() {
        return chat_has_username;
    }

    public void setChat_has_username(boolean chat_has_username) {
        this.chat_has_username = chat_has_username;
    }

    public boolean isChat_is_created() {
        return chat_is_created;
    }

    public void setChat_is_created(boolean chat_is_created) {
        this.chat_is_created = chat_is_created;
    }

    public ChatAdministratorRights getUser_administrator_rights() {
        return user_administrator_rights;
    }

    public void setUser_administrator_rights(ChatAdministratorRights user_administrator_rights) {
        this.user_administrator_rights = user_administrator_rights;
    }

    public ChatAdministratorRights getBot_administrator_rights() {
        return bot_administrator_rights;
    }

    public void setBot_administrator_rights(ChatAdministratorRights bot_administrator_rights) {
        this.bot_administrator_rights = bot_administrator_rights;
    }

    public boolean isBot_is_member() {
        return bot_is_member;
    }

    public void setBot_is_member(boolean bot_is_member) {
        this.bot_is_member = bot_is_member;
    }
}
