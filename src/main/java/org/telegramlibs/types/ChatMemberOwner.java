package org.telegramlibs.types;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonDeserialize
public class ChatMemberOwner extends ChatMember{
    private boolean is_anonymous;
    private String custom_title;

    public boolean isIs_anonymous() {
        return is_anonymous;
    }

    public void setIs_anonymous(boolean is_anonymous) {
        this.is_anonymous = is_anonymous;
    }

    public String getCustom_title() {
        return custom_title;
    }

    public void setCustom_title(String custom_title) {
        this.custom_title = custom_title;
    }
}
