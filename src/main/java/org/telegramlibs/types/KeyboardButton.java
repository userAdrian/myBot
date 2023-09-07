package org.telegramlibs.types;

public class KeyboardButton implements java.io.Serializable {
    private String text;
    private KeyboardButtonRequestUser request_user;
    private KeyboardButtonRequestChat request_chat;
    private boolean request_contact;
    private boolean request_location;
    private KeyboardButtonPollType request_poll;
    private WebAppInfo web_app;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public KeyboardButtonRequestUser getRequest_user() {
        return request_user;
    }

    public void setRequest_user(KeyboardButtonRequestUser request_user) {
        this.request_user = request_user;
    }

    public KeyboardButtonRequestChat getRequest_chat() {
        return request_chat;
    }

    public void setRequest_chat(KeyboardButtonRequestChat request_chat) {
        this.request_chat = request_chat;
    }

    public boolean isRequest_contact() {
        return request_contact;
    }

    public void setRequest_contact(boolean request_contact) {
        this.request_contact = request_contact;
    }

    public boolean isRequest_location() {
        return request_location;
    }

    public void setRequest_location(boolean request_location) {
        this.request_location = request_location;
    }

    public KeyboardButtonPollType getRequest_poll() {
        return request_poll;
    }

    public void setRequest_poll(KeyboardButtonPollType request_poll) {
        this.request_poll = request_poll;
    }

    public WebAppInfo getWeb_app() {
        return web_app;
    }

    public void setWeb_app(WebAppInfo web_app) {
        this.web_app = web_app;
    }
}
