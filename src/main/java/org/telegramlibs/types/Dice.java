package org.telegramlibs.types;

public class Dice implements java.io.Serializable {
    private String emoji;
    private Integer value;

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
