package com.brujp.kafka.demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "ecommerce.cliente", groupId = "ecommerce-groupId")
    public void consumer(String message) {
        System.out.println(message);
    }
}
