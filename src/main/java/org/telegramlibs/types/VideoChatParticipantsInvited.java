package org.telegramlibs.types;

import java.util.*;

public class VideoChatParticipantsInvited implements java.io.Serializable {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
