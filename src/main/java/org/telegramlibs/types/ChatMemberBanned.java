package org.telegramlibs.types;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonDeserialize
public class ChatMemberBanned extends ChatMember{
    private String until_date;

    public String getUntil_date() {
        return until_date;
    }

    public void setUntil_date(String until_date) {
        this.until_date = until_date;
    }
}
