package org.telegramlibs.types;

public class WebAppData implements java.io.Serializable {
    private String data;
    private String button_text;
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getButton_text() {
        return button_text;
    }

    public void setButton_text(String button_text) {
        this.button_text = button_text;
    }
}
