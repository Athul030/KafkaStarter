# Kafka Spring Boot Application

This is a simple Spring Boot application that demonstrates how to integrate Apache Kafka for message production and consumption.

## Components
1. Producer
   The Producer component is responsible for sending messages to a Kafka topic. It utilizes Spring Kafka's KafkaTemplate for message publishing.

2. Consumer
   The Consumer component listens for messages from a Kafka topic. It uses Spring Kafka's @KafkaListener annotation to consume messages from the configured topic.

3. MessageController
   The MessageController is a Spring MVC controller that exposes a REST endpoint (/send) to send messages to Kafka. It uses the Producer component to send messages when a POST request is made to the /send endpoint.

4. TopicConfig
   The TopicConfig class is a Spring configuration class responsible for creating Kafka topics and configuring necessary beans like KafkaTemplate. It defines a Kafka topic with the specified name, partitions, and replication factor.

## Configuration
The Kafka configuration is specified in the application.properties file. Ensure that the following properties are correctly configured:


*Kafka Producer Configuration*
spring.kafka.producer.bootstrap-servers=localhost:9092 

spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer 

spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer

*Kafka Consumer Configuration*
spring.kafka.consumer.bootstrap-servers=localhost:9092 

spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer 

spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer 

spring.kafka.consumer.group-id=my-group

## Usage
Ensure that Apache Kafka is installed and running locally. Adjust the Kafka server address and port in the application.properties file if necessary.

Start the Spring Boot application.

Use any HTTP client (e.g., cURL, Postman) to send messages to Kafka by making a POST request to http://localhost:8080/send with the message content in the request body.

Observe the console logs of the Spring Boot application to see the messages being consumed by the Consumer.

## Dependencies
This project relies on the following dependencies:

Spring Boot Starter Web
Spring Kafka 



### Feel free to expand this README with more detailed instructions or explanations as needed for your specific use case.
