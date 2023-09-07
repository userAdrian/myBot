package org.telegramlibs.types;

public class VideoNote implements java.io.Serializable {
    private String file_id;
    private String file_unique_id;
    private Integer length;
    private Integer duration;
    private PhotoSize thumbnail;
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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getFile_size() {
        return file_size;
    }

    public void setFile_size(String file_size) {
        this.file_size = file_size;
    }
}
