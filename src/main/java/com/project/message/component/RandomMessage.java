package com.project.message.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomMessage {

    @Autowired
    private Random random;

    @Autowired
    private MessageCreator messageCreator;

    public String getRandomMessage() {
        return messageCreator.getListOfMessages().get(random.nextInt(messageCreator.getListOfMessages().size()));
    }
}
