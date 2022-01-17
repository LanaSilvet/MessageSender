package com.project.message.scheduling;

import com.project.message.component.RandomMessage;
import com.project.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MessageScheduler {

    @Autowired
    private MessageService messageService;

    @Autowired
    private RandomMessage randomMessage;

    @Scheduled(fixedRate = 60000)
    public void getMessageScheduler() {
        messageService.getMessage(randomMessage.getRandomMessage());
    }
}
