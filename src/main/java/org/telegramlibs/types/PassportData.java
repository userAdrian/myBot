package org.telegramlibs.types;

import java.util.*;

public class PassportData implements java.io.Serializable {
    private List<EncryptedPassportElement> data;
    private EncryptedCredentials credentials;
}
