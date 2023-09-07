package org.telegramlibs.types;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonDeserialize

public class ChatMemberRestricted extends ChatMember {
    private boolean is_member;
    private boolean can_send_messages;
    private boolean can_send_audios;
    private boolean can_send_documents;
    private boolean can_send_photos;
    private boolean can_send_videos;
    private boolean can_send_video_notes;
    private boolean can_send_voice_notes;
    private boolean can_send_polls;
    private boolean can_send_other_messages;
    private boolean can_send_web_page_previews;
    private boolean can_change_info;
    private boolean can_invite_users;
    private boolean can_pin_messages;
    private boolean can_manage_topics;
    private Integer until_date;

    public boolean isIs_member() {
        return is_member;
    }

    public void setIs_member(boolean is_member) {
        this.is_member = is_member;
    }

    public boolean isCan_send_messages() {
        return can_send_messages;
    }

    public void setCan_send_messages(boolean can_send_messages) {
        this.can_send_messages = can_send_messages;
    }

    public boolean isCan_send_audios() {
        return can_send_audios;
    }

    public void setCan_send_audios(boolean can_send_audios) {
        this.can_send_audios = can_send_audios;
    }

    public boolean isCan_send_documents() {
        return can_send_documents;
    }

    public void setCan_send_documents(boolean can_send_documents) {
        this.can_send_documents = can_send_documents;
    }

    public boolean isCan_send_photos() {
        return can_send_photos;
    }

    public void setCan_send_photos(boolean can_send_photos) {
        this.can_send_photos = can_send_photos;
    }

    public boolean isCan_send_videos() {
        return can_send_videos;
    }

    public void setCan_send_videos(boolean can_send_videos) {
        this.can_send_videos = can_send_videos;
    }

    public boolean isCan_send_video_notes() {
        return can_send_video_notes;
    }

    public void setCan_send_video_notes(boolean can_send_video_notes) {
        this.can_send_video_notes = can_send_video_notes;
    }

    public boolean isCan_send_voice_notes() {
        return can_send_voice_notes;
    }

    public void setCan_send_voice_notes(boolean can_send_voice_notes) {
        this.can_send_voice_notes = can_send_voice_notes;
    }

    public boolean isCan_send_polls() {
        return can_send_polls;
    }

    public void setCan_send_polls(boolean can_send_polls) {
        this.can_send_polls = can_send_polls;
    }

    public boolean isCan_send_other_messages() {
        return can_send_other_messages;
    }

    public void setCan_send_other_messages(boolean can_send_other_messages) {
        this.can_send_other_messages = can_send_other_messages;
    }

    public boolean isCan_send_web_page_previews() {
        return can_send_web_page_previews;
    }

    public void setCan_send_web_page_previews(boolean can_send_web_page_previews) {
        this.can_send_web_page_previews = can_send_web_page_previews;
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

    public Integer getUntil_date() {
        return until_date;
    }

    public void setUntil_date(Integer until_date) {
        this.until_date = until_date;
    }
}
