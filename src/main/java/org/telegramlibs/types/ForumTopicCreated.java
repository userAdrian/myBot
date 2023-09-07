package org.telegramlibs.types;

public class ForumTopicCreated implements java.io.Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIcon_color() {
        return icon_color;
    }

    public void setIcon_color(Integer icon_color) {
        this.icon_color = icon_color;
    }

    public String getIcon_custom_emoji_id() {
        return icon_custom_emoji_id;
    }

    public void setIcon_custom_emoji_id(String icon_custom_emoji_id) {
        this.icon_custom_emoji_id = icon_custom_emoji_id;
    }

    private String name;
    private Integer icon_color;
    private String icon_custom_emoji_id;
}
