package org.telegramlibs.deserializers;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.deser.std.StdDeserializer;
import org.codehaus.jackson.type.TypeReference;
import org.telegramlibs.types.*;

import java.io.IOException;

/**
 * Custom deserializer for {@code ChatMember} class.
 */
public class ChatMemberDeserializer extends StdDeserializer<ChatMember> {
    ObjectMapper mapper = new ObjectMapper();
    public ChatMemberDeserializer(){
        this(null);
    }
    private ChatMemberDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public ChatMember deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);

        switch (node.get("status").asText()){
            case "administrator":
                return mapper.readValue(node.toString(), ChatMemberAdministrator.class);
            case "restricted":
                return mapper.readValue(node.toString(), ChatMemberRestricted.class);
            case "kicked":
                return mapper.readValue(node.toString(), ChatMemberBanned.class);
            case "creator":
                return mapper.readValue(node.toString(), ChatMemberOwner.class);
            case "left":
                return mapper.readValue(node.toString(), ChatMemberLeft.class);
            case "member":
                return mapper.readValue(node.toString(), ChatMemberMember.class);
            default:
                return null;
        }
    }
}
