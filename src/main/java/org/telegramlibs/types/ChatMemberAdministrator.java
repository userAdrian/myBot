package org.telegramlibs.types;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonDeserialize
public class ChatMemberAdministrator extends ChatMember {
    private boolean can_be_edited;
    private boolean is_anonymous;
    private boolean can_manage_chat;
    private boolean can_delete_messages;
    private boolean can_manage_video_chats;
    private boolean can_restrict_members;
    private boolean can_promote_members;
    private boolean can_change_info;
    private boolean can_invite_users;
    private boolean can_post_messages;
    private boolean can_edit_messages;
    private boolean can_pin_messages;
    private boolean can_manage_topics;
    private String custom_title;

    public boolean isCan_be_edited() {
        return can_be_edited;
    }

    public void setCan_be_edited(boolean can_be_edited) {
        this.can_be_edited = can_be_edited;
    }

    public boolean isIs_anonymous() {
        return is_anonymous;
    }

    public void setIs_anonymous(boolean is_anonymous) {
        this.is_anonymous = is_anonymous;
    }

    public boolean isCan_manage_chat() {
        return can_manage_chat;
    }

    public void setCan_manage_chat(boolean can_manage_chat) {
        this.can_manage_chat = can_manage_chat;
    }

    public boolean isCan_delete_messages() {
        return can_delete_messages;
    }

    public void setCan_delete_messages(boolean can_delete_messages) {
        this.can_delete_messages = can_delete_messages;
    }

    public boolean isCan_manage_video_chats() {
        return can_manage_video_chats;
    }

    public void setCan_manage_video_chats(boolean can_manage_video_chats) {
        this.can_manage_video_chats = can_manage_video_chats;
    }

    public boolean isCan_restrict_members() {
        return can_restrict_members;
    }

    public void setCan_restrict_members(boolean can_restrict_members) {
        this.can_restrict_members = can_restrict_members;
    }

    public boolean isCan_promote_members() {
        return can_promote_members;
    }

    public void setCan_promote_members(boolean can_promote_members) {
        this.can_promote_members = can_promote_members;
    }

    public boolean isCan_change_info() {
        return can_change_info;
    }

    public void setCan_change_info(boolean can_change_info) {
        this.can_change_info = can_change_info;
    }

    public boolean isCan_invite_users() {
        return can_invite_users;
    }

    public void setCan_invite_users(boolean can_invite_users) {
        this.can_invite_users = can_invite_users;
    }

    public boolean isCan_post_messages() {
        return can_post_messages;
    }

    public void setCan_post_messages(boolean can_post_messages) {
        this.can_post_messages = can_post_messages;
    }

    public boolean isCan_edit_messages() {
        return can_edit_messages;
    }

    public void setCan_edit_messages(boolean can_edit_messages) {
        this.can_edit_messages = can_edit_messages;
    }

    public boolean isCan_pin_messages() {
        return can_pin_messages;
    }

    public void setCan_pin_messages(boolean can_pin_messages) {
        this.can_pin_messages = can_pin_messages;
    }

    public boolean isCan_manage_topics() {
        return can_manage_topics;
    }

    public void setCan_manage_topics(boolean can_manage_topics) {
        this.can_manage_topics = can_manage_topics;
    }

    public String getCustom_title() {
        return custom_title;
    }

    public void setCustom_title(String custom_title) {
        this.custom_title = custom_title;
    }
}
