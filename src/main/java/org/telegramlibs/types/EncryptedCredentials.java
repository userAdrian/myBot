package org.telegramlibs.types;

public class EncryptedCredentials implements java.io.Serializable {
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    private String data;
    private String hash;
    private String secret;
}
