package com.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class TopicConfig {

    @Value("${spring.kafka.consumer.group-id}")
    private String topic;

    @Bean
    NewTopic createTopic(){

        //new topic is defined with the topic name "my-topic,"
        // along with 3 partitions and a replication factor of 1
        return new NewTopic(topic,3,(short)1);
    }

    @Bean
    public KafkaTemplate<String,String> kafkaTemplate(ProducerFactory<String,String> producerFactory){
        return new KafkaTemplate<>(producerFactory);
    }
}
