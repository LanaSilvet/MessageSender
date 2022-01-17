package com.project.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageService {
    static final String URL = "http://localhost:8080/message/save";

    @Autowired
    private RestTemplate restTemplate;

    public void getMessage(String message) {
        restTemplate.postForObject(URL, message, String.class);
    }
}
