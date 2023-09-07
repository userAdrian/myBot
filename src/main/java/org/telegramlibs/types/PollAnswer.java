package org.telegramlibs.types;

import java.util.*;
public class PollAnswer {
    private String poll_id;
    private Chat voter_chat;
    private User user;
    private List<Integer> option_ids;

    public String getPoll_id() {
        return poll_id;
    }

    public void setPoll_id(String poll_id) {
        this.poll_id = poll_id;
    }

    public Chat getVoter_chat() {
        return voter_chat;
    }

    public void setVoter_chat(Chat voter_chat) {
        this.voter_chat = voter_chat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getOption_ids() {
        return option_ids;
    }

    public void setOption_ids(List<Integer> option_ids) {
        this.option_ids = option_ids;
    }
}
