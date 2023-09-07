package org.telegramlibs.types;

public class User implements java.io.Serializable {
    private String id;
    private boolean is_bot;
    private String first_name;
    private String last_name;
    private String username;
    private String language_code;
    private boolean is_premium;
    private boolean added_to_attachment_menu;
    private boolean can_join_groups;
    private boolean can_read_all_group_messages;
    private boolean supports_inline_queries;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIs_bot() {
        return is_bot;
    }

    public void setIs_bot(boolean is_bot) {
        this.is_bot = is_bot;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    public boolean isIs_premium() {
        return is_premium;
    }

    public void setIs_premium(boolean is_premium) {
        this.is_premium = is_premium;
    }

    public boolean isAdded_to_attachment_menu() {
        return added_to_attachment_menu;
    }

    public void setAdded_to_attachment_menu(boolean added_to_attachment_menu) {
        this.added_to_attachment_menu = added_to_attachment_menu;
    }

    public boolean isCan_join_groups() {
        return can_join_groups;
    }

    public void setCan_join_groups(boolean can_join_groups) {
        this.can_join_groups = can_join_groups;
    }

    public boolean isCan_read_all_group_messages() {
        return can_read_all_group_messages;
    }

    public void setCan_read_all_group_messages(boolean can_read_all_group_messages) {
        this.can_read_all_group_messages = can_read_all_group_messages;
    }

    public boolean isSupports_inline_queries() {
        return supports_inline_queries;
    }

    public void setSupports_inline_queries(boolean supports_inline_queries) {
        this.supports_inline_queries = supports_inline_queries;
    }
}
