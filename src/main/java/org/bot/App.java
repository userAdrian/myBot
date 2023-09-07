package org.bot;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.IOException;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static final String TOKEN = ""; //put here the token generated with @BotFather

    public static void main(String[] args) throws IOException {
        logger.info("START logging");
        HeadQuarter hq = new HeadQuarter();
        hq.start();
    }

}