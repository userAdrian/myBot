package org.telegramlibs.types;

public class Voice implements java.io.Serializable {
    private String file_id;
    private String file_unique_id;
    private Integer duration;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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
