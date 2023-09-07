package org.telegramlibs.types;

public class MessageEntity implements java.io.Serializable {
    private String type;
    private String offset;
    private Integer length;
    private String url;
    private User user;
    private String language;
    private String custom_emoji_id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCustom_emoji_id() {
        return custom_emoji_id;
    }

    public void setCustom_emoji_id(String custom_emoji_id) {
        this.custom_emoji_id = custom_emoji_id;
    }
}
