package org.telegramlibs.types;

public class Video implements java.io.Serializable {
    private String file_id;
    private String file_unique_id;
    private Integer width;
    private Integer height;
    private PhotoSize thumbnail;
    private String file_name;
    private String mime_type;
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

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getMime_type() {
        return mime_type;
    }

    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }

    public String getFile_size() {
        return file_size;
    }

    public void setFile_size(String file_size) {
        this.file_size = file_size;
    }
}
