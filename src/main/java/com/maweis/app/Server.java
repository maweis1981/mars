package com.maweis.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by peter on 12/20/13.
 */
public class Server {

    static final Logger logger = LoggerFactory.getLogger(Server.class);

    public static void main(String[] args) {
        logger.info("Server Running...");
        new ClassPathXmlApplicationContext("applicationContext.xml");
    }

}
