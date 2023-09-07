package org.telegramlibs.types;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class InlineKeyboardButton {
    private String text;
    private String url;
    private String callback_data;
    private WebAppInfo web_app;
    private LoginUrl login_url;
    private String switch_inline_query;
    private String switch_inline_query_current_chat;
    private SwitchInlineQueryChosenChat switch_inline_query_chosen_chat;
    private CallbackGame callback_game;
    private boolean pay;

    public  InlineKeyboardButton(){};
    public InlineKeyboardButton(String text, String callback_data){
        this.text = text;
        this.callback_data = callback_data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCallback_data() {
        return callback_data;
    }

    public void setCallback_data(String callback_data) {
        this.callback_data = callback_data;
    }

    public WebAppInfo getWeb_app() {
        return web_app;
    }

    public void setWeb_app(WebAppInfo web_app) {
        this.web_app = web_app;
    }

    public LoginUrl getLogin_url() {
        return login_url;
    }

    public void setLogin_url(LoginUrl login_url) {
        this.login_url = login_url;
    }

    public String getSwitch_inline_query() {
        return switch_inline_query;
    }

    public void setSwitch_inline_query(String switch_inline_query) {
        this.switch_inline_query = switch_inline_query;
    }

    public String getSwitch_inline_query_current_chat() {
        return switch_inline_query_current_chat;
    }

    public void setSwitch_inline_query_current_chat(String switch_inline_query_current_chat) {
        this.switch_inline_query_current_chat = switch_inline_query_current_chat;
    }

    public SwitchInlineQueryChosenChat getSwitch_inline_query_chosen_chat() {
        return switch_inline_query_chosen_chat;
    }

    public void setSwitch_inline_query_chosen_chat(SwitchInlineQueryChosenChat switch_inline_query_chosen_chat) {
        this.switch_inline_query_chosen_chat = switch_inline_query_chosen_chat;
    }

    public CallbackGame getCallback_game() {
        return callback_game;
    }

    public void setCallback_game(CallbackGame callback_game) {
        this.callback_game = callback_game;
    }

    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }
}
