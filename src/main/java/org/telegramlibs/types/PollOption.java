package org.telegramlibs.types;

public class PollOption implements java.io.Serializable {
    private String text;
    private Integer voter_count;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getVoter_count() {
        return voter_count;
    }

    public void setVoter_count(Integer voter_count) {
        this.voter_count = voter_count;
    }
}
