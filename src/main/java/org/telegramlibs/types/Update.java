package org.telegramlibs.types;

public class Update implements java.io.Serializable {
    private Integer update_id;
    private Message message;
    private Message edited_message;
    private Message channel_post;
    private Message edited_channel_post;
    private InlineQuery inline_query;
    private ChosenInlineResult chosen_inline_result;
    private CallbackQuery callback_query;
    private ShippingQuery shippingQuery;
    private PreCheckoutQuery pre_checkout_query;
    private Poll poll;
    private PollAnswer poll_answer;
    private ChatMemberUpdated my_chat_member;
    private ChatMemberUpdated chat_member;
    private ChatJoinRequest chat_join_request;

    public Integer getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(Integer update_id) {
        this.update_id = update_id;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Message getEdited_message() {
        return edited_message;
    }

    public void setEdited_message(Message edited_message) {
        this.edited_message = edited_message;
    }

    public Message getChannel_post() {
        return channel_post;
    }

    public void setChannel_post(Message channel_post) {
        this.channel_post = channel_post;
    }

    public Message getEdited_channel_post() {
        return edited_channel_post;
    }

    public void setEdited_channel_post(Message edited_channel_post) {
        this.edited_channel_post = edited_channel_post;
    }

    public InlineQuery getInline_query() {
        return inline_query;
    }

    public void setInline_query(InlineQuery inline_query) {
        this.inline_query = inline_query;
    }

    public ChosenInlineResult getChosen_inline_result() {
        return chosen_inline_result;
    }

    public void setChosen_inline_result(ChosenInlineResult chosen_inline_result) {
        this.chosen_inline_result = chosen_inline_result;
    }

    public CallbackQuery getCallback_query() {
        return callback_query;
    }

    public void setCallback_query(CallbackQuery callback_query) {
        this.callback_query = callback_query;
    }

    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    public void setShippingQuery(ShippingQuery shippingQuery) {
        this.shippingQuery = shippingQuery;
    }

    public PreCheckoutQuery getPre_checkout_query() {
        return pre_checkout_query;
    }

    public void setPre_checkout_query(PreCheckoutQuery pre_checkout_query) {
        this.pre_checkout_query = pre_checkout_query;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public PollAnswer getPoll_answer() {
        return poll_answer;
    }

    public void setPoll_answer(PollAnswer poll_answer) {
        this.poll_answer = poll_answer;
    }

    public ChatMemberUpdated getMy_chat_member() {
        return my_chat_member;
    }

    public void setMy_chat_member(ChatMemberUpdated my_chat_member) {
        this.my_chat_member = my_chat_member;
    }

    public ChatMemberUpdated getChat_member() {
        return chat_member;
    }

    public void setChat_member(ChatMemberUpdated chat_member) {
        this.chat_member = chat_member;
    }

    public ChatJoinRequest getChat_join_request() {
        return chat_join_request;
    }

    public void setChat_join_request(ChatJoinRequest chat_join_request) {
        this.chat_join_request = chat_join_request;
    }
}
