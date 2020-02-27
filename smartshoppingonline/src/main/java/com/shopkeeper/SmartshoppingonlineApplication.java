package com.shopkeeper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartshoppingonlineApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(SmartshoppingonlineApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SmartshoppingonlineApplication.class, args);
		logger.info("this is a info message from main app--");
	}

}
