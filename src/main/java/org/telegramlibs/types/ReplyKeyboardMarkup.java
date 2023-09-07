package org.telegramlibs.types;

import java.util.*;

public class ReplyKeyboardMarkup implements java.io.Serializable {
    private List<List<KeyboardButton>> keyboard;
    private boolean is_persistent;
    private boolean resize_keyboard;
    private boolean one_time_keyboard;
    private String input_field_placeholder;
    private boolean selective;

    public ReplyKeyboardMarkup(){};

    public ReplyKeyboardMarkup(List<List<KeyboardButton>> keyboard){
        this.keyboard = keyboard;
    }

    public List<List<KeyboardButton>> getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(List<List<KeyboardButton>> keyboard) {
        this.keyboard = keyboard;
    }

    public boolean isIs_persistent() {
        return is_persistent;
    }

    public void setIs_persistent(boolean is_persistent) {
        this.is_persistent = is_persistent;
    }

    public boolean isResize_keyboard() {
        return resize_keyboard;
    }

    public void setResize_keyboard(boolean resize_keyboard) {
        this.resize_keyboard = resize_keyboard;
    }

    public boolean isOne_time_keyboard() {
        return one_time_keyboard;
    }

    public void setOne_time_keyboard(boolean one_time_keyboard) {
        this.one_time_keyboard = one_time_keyboard;
    }

    public String getInput_field_placeholder() {
        return input_field_placeholder;
    }

    public void setInput_field_placeholder(String input_field_placeholder) {
        this.input_field_placeholder = input_field_placeholder;
    }

    public boolean isSelective() {
        return selective;
    }

    public void setSelective(boolean selective) {
        this.selective = selective;
    }
}
