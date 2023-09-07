package org.telegramlibs.types;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.telegramlibs.deserializers.ChatMemberDeserializer;

@JsonDeserialize(using = ChatMemberDeserializer.class)
public class ChatMember implements java.io.Serializable {
    private String status;
    private User user;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
