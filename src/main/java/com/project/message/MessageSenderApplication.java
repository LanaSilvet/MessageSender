package com.project.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MessageSenderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessageSenderApplication.class, args);
    }
}
