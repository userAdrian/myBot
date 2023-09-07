package org.telegramlibs.types;

public class ChatInviteLink implements java.io.Serializable {
    private String invite_link;
    private User creator;
    private boolean creates_join_request;
    private boolean is_primary;
    private boolean is_revoked;
    private String name;
    private String expire_date;
    private Integer member_limit;
    private Integer pending_join_request_count;

    public String getInvite_link() {
        return invite_link;
    }

    public void setInvite_link(String invite_link) {
        this.invite_link = invite_link;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public boolean isCreates_join_request() {
        return creates_join_request;
    }

    public void setCreates_join_request(boolean creates_join_request) {
        this.creates_join_request = creates_join_request;
    }

    public boolean isIs_primary() {
        return is_primary;
    }

    public void setIs_primary(boolean is_primary) {
        this.is_primary = is_primary;
    }

    public boolean isIs_revoked() {
        return is_revoked;
    }

    public void setIs_revoked(boolean is_revoked) {
        this.is_revoked = is_revoked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(String expire_date) {
        this.expire_date = expire_date;
    }

    public Integer getMember_limit() {
        return member_limit;
    }

    public void setMember_limit(Integer member_limit) {
        this.member_limit = member_limit;
    }

    public Integer getPending_join_request_count() {
        return pending_join_request_count;
    }

    public void setPending_join_request_count(Integer pending_join_request_count) {
        this.pending_join_request_count = pending_join_request_count;
    }
}
