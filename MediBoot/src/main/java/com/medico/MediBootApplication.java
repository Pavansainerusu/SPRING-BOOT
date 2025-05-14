package com.medico;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class MediBootApplication {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(LoggerofMyApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MediBootApplication.class, args);
	}

}
