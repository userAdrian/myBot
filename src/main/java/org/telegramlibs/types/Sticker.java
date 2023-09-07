package org.telegramlibs.types;

public class Sticker implements java.io.Serializable {
    private String file_id;
    private String file_unique_id;
    private String type;
    private Integer width;
    private Integer height;
    private boolean is_animated;
    private boolean is_video;
    private PhotoSize thumbnail;
    private String emoji;
    private String set_name;
    private File premium_animation;
    private MarkPosition mark_position;
    private String custom_emoji;
    private boolean needs_repainting;
    private String file_size;

    public String getFile_id() {
        return file_id;
    }

    public void setFile_id(String file_id) {
        this.file_id = file_id;
    }

    public String getFile_unique_id() {
        return file_unique_id;
    }

    public void setFile_unique_id(String file_unique_id) {
        this.file_unique_id = file_unique_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public boolean isIs_animated() {
        return is_animated;
    }

    public void setIs_animated(boolean is_animated) {
        this.is_animated = is_animated;
    }

    public boolean isIs_video() {
        return is_video;
    }

    public void setIs_video(boolean is_video) {
        this.is_video = is_video;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String getSet_name() {
        return set_name;
    }

    public void setSet_name(String set_name) {
        this.set_name = set_name;
    }

    public File getPremium_animation() {
        return premium_animation;
    }

    public void setPremium_animation(File premium_animation) {
        this.premium_animation = premium_animation;
    }

    public MarkPosition getMark_position() {
        return mark_position;
    }

    public void setMark_position(MarkPosition mark_position) {
        this.mark_position = mark_position;
    }

    public String getCustom_emoji() {
        return custom_emoji;
    }

    public void setCustom_emoji(String custom_emoji) {
        this.custom_emoji = custom_emoji;
    }

    public boolean isNeeds_repainting() {
        return needs_repainting;
    }

    public void setNeeds_repainting(boolean needs_repainting) {
        this.needs_repainting = needs_repainting;
    }

    public String getFile_size() {
        return file_size;
    }

    public void setFile_size(String file_size) {
        this.file_size = file_size;
    }
}
