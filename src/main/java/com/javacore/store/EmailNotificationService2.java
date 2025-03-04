package com.javacore.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService2 implements NotificationService2{

    @Value("${mail.host}")
    private String host;

    @Value("{mail.port}")
    private String port;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println(message + " " + recipientEmail);
    }
}
