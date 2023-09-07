package org.telegramlibs.types;

public class LoginUrl implements java.io.Serializable {
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForward_text() {
        return forward_text;
    }

    public void setForward_text(String forward_text) {
        this.forward_text = forward_text;
    }

    public String getBot_username() {
        return bot_username;
    }

    public void setBot_username(String bot_username) {
        this.bot_username = bot_username;
    }

    public boolean isRequest_write_access() {
        return request_write_access;
    }

    public void setRequest_write_access(boolean request_write_access) {
        this.request_write_access = request_write_access;
    }

    private String url;
    private String forward_text;
    private String bot_username;
    private boolean request_write_access;
}
