package com.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "my-topic",groupId = "my-group")
    public void consumeEvent(String msg){
        System.out.println("The info is"+msg);
    }
}
