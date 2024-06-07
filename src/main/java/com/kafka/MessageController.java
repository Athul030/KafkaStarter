package com.kafka;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final Producer producer;

    public MessageController(Producer producer) {
        this.producer = producer;
    }


    @PostMapping("/send")
    public String sendMessage(@RequestBody String message){
        producer.sendData(message);
        return "Message sent to Kafka: " + message;
    }

}
