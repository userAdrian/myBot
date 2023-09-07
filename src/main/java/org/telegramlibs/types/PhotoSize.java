package org.telegramlibs.types;

public class PhotoSize implements java.io.Serializable {
    private String file_id;
    private String file_unique_id;
    private Integer width;
    private Integer height;
    private Integer file_size;

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

    public Integer getFile_size() {
        return file_size;
    }

    public void setFile_size(Integer file_size) {
        this.file_size = file_size;
    }
}
