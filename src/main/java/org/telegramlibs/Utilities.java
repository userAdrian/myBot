package org.telegramlibs;

import okhttp3.*;
import org.slf4j.*;
import org.bot.App;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.type.*;
import org.codehaus.jackson.map.*;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;

import org.telegramlibs.types.*;

public class Utilities {
    private static final Logger logger = LoggerFactory.getLogger(Utilities.class);
    private static ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
    private static OkHttpClient client = new OkHttpClient.Builder()
            .connectionSpecs(Arrays.asList(ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS))
            .build();
    private static final String URL = "https://api.telegram.org/bot" + App.TOKEN;
    private Integer last_index = 0; //store the last update_id received

    public Utilities() {
    }

    /**
     * Making a request to get updates using long polling
     *
     * @return a list of incoming updates
     */
    public List<Update> getUpdates() {
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("timeout", "5") //waiting 5 seconds for new updates
                .addFormDataPart("offset", String.valueOf(last_index + 1)) //confirm updates
                .build();

        Request request = new Request.Builder()
                .url(URL + "/getUpdates")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            StringBuilder response_str = new StringBuilder(response.body().string());
            //checking if the response contain an error
            if (!response.isSuccessful()) {
                logger.error("Trying to get an update " + response_str.toString());
                throw new TelegramApiException(response_str.toString());
            }
            //remove the initial part of the response: {"ok":true,"result":
            response_str.delete(0, 20);
            System.out.println(response_str);
            //deserializing a list of updates
            List<Update> updates_list = mapper.readValue(response_str.toString(), new TypeReference<List<Update>>() {
            });
            if (!updates_list.isEmpty())
                last_index = updates_list.get(updates_list.size() - 1).getUpdate_id();
            return updates_list;
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Send a message with only text. Markdown is set as parse mode.
     *
     * @param chat_id unique chat identifier
     * @param text    to be sent
     */
    public void sendMessage(String chat_id, String text) {
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("chat_id", chat_id)
                .addFormDataPart("text", text)
                .addFormDataPart("parse_mode", "Markdown")
                .build();

        Request request = new Request.Builder()
                .url(URL + "/sendMessage")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String response_str = response.body().string();
            //checking if the response contain an error
            if (!response.isSuccessful()) {
                logger.error("Trying to send a message without buttons " + response_str);
                throw new TelegramApiException(response_str);
            }
        } catch (IOException | TelegramApiException e) {
            e.printStackTrace();
        }
    }

    /**
     * Send a message with buttons.
     *
     * @param chat_id      unique chat identifier
     * @param text         to be sent
     * @param reply_markup serialized {@code InlineKeyboardMarkup} object
     */
    public void sendMessage(String chat_id, String text, String reply_markup) {
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("chat_id", chat_id)
                .addFormDataPart("text", text)
                .addFormDataPart("reply_markup", reply_markup)
                .build();

        Request request = new Request.Builder()
                .url(URL + "/sendMessage")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String response_str = response.body().string();
            if (!response.isSuccessful()) {
                logger.error("Trying to send a message with buttons " + response_str);
                throw new TelegramApiException(response_str);
            }
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete a message.
     *
     * @param chat_id    unique chat identifier
     * @param message_id unique message identifier
     */
    public void deleteMessage(String chat_id, String message_id) {
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("chat_id", chat_id)
                .addFormDataPart("message_id", message_id)
                .build();

        Request request = new Request.Builder()
                .url(URL + "/deleteMessage")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String response_str = response.body().string();
            if (!response.isSuccessful()) {
                logger.error("Trying to delete a message " + response_str);
                throw new TelegramApiException(response_str);
            }
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Send a message with a photo.
     *
     * @param chat_id      unique chat identifier
     * @param caption      text to sent with the photo
     * @param photo        to be sent
     * @param reply_markup serialized {@code InlineKeyboardMarkup} object
     */
    public void sendPhoto(String chat_id, String caption, @NotNull PhotoSize photo, String reply_markup) {
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("chat_id", chat_id)
                .addFormDataPart("caption", caption)
                .addFormDataPart("photo", photo.getFile_id())
                .addFormDataPart("reply_markup", reply_markup)
                .build();

        Request request = new Request.Builder()
                .url(URL + "/sendPhoto")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String response_str = response.body().string();
            if (!response.isSuccessful()) {
                logger.error("Trying to send a photo with caption and buttons " + response_str);
                throw new TelegramApiException(response_str);
            }
        } catch (TelegramApiException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Send a photo to a chat.
     *
     * @param chat_id unique chat identifier
     * @param photo   file to be sent
     * @return a {@code PhotoSize} object or null if there is a TelegramApiException
     */
    public PhotoSize sendPhoto(String chat_id, String caption, File photo, String reply_markup) {
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("chat_id", chat_id)
                .addFormDataPart("caption", caption)
                .addFormDataPart("photo", photo.getName(), RequestBody.create(photo, MediaType.parse("image")))
                .addFormDataPart("reply_markup", reply_markup)
                .build();

        Request request = new Request.Builder()
                .url(URL + "/sendPhoto")
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            StringBuilder response_str = new StringBuilder(response.body().string());
            if (!response.isSuccessful()) {
                logger.error("Trying to upload a photo for the first time " + response_str.toString());
                throw new TelegramApiException(response_str.toString());
            }
            //remove the initial part of the response: {"ok":true,"result":
            response_str.delete(0, 20);
            //deserialize a message object
            Message m = mapper.readValue(response_str.toString(), Message.class);
            return m.getPhoto().get(0);
        } catch (IOException | TelegramApiException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Serialize an object
     *
     * @param object to be serialized
     * @param <T>
     * @return a JSON serialize string or null if there is an IOException
     */
    public <T> String serialize(T object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (IOException e) {
            logger.error("Serializing an object", e);
            e.printStackTrace();
        }
        return null;
    }
}
