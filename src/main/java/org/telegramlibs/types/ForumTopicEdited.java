package org.telegramlibs.types;

public class ForumTopicEdited implements java.io.Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon_custom_emoji_id() {
        return icon_custom_emoji_id;
    }

    public void setIcon_custom_emoji_id(String icon_custom_emoji_id) {
        this.icon_custom_emoji_id = icon_custom_emoji_id;
    }

    private String name;
    private String icon_custom_emoji_id;
}
