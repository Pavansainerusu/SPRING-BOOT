package com.medico;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class LoggerofMyApplication {

    private static final Logger logger = LoggerFactory.getLogger(LoggerofMyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoggerofMyApplication.class, args);

        // Log a message to verify logging works
        logger.info("Spring Boot application started successfully!");
    }
}