package org.telegramlibs.types;

import java.util.*;
public class InlineKeyboardMarkup implements java.io.Serializable {
    private InlineKeyboardButton[][] inline_keyboard;

    public InlineKeyboardMarkup(){};
    public InlineKeyboardMarkup(InlineKeyboardButton[][] inline_keyboard){
        this.inline_keyboard = inline_keyboard;
    }
    public InlineKeyboardButton[][] getInline_keyboard() {
        return inline_keyboard;
    }

    public void setInline_keyboard(InlineKeyboardButton[][] inline_keyboard) {
        this.inline_keyboard = inline_keyboard;
    }
}
