package org.telegramlibs.types;

public class KeyboardButtonRequestUser implements java.io.Serializable {
    private String request_id;
    private boolean user_is_bot;
    private boolean user_is_premium;

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public boolean isUser_is_bot() {
        return user_is_bot;
    }

    public void setUser_is_bot(boolean user_is_bot) {
        this.user_is_bot = user_is_bot;
    }

    public boolean isUser_is_premium() {
        return user_is_premium;
    }

    public void setUser_is_premium(boolean user_is_premium) {
        this.user_is_premium = user_is_premium;
    }
}

