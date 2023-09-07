package org.telegramlibs.types;

public class UserShared implements java.io.Serializable {
    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    private String request_id;
    private String user_id;
}
