package com.pradeep.kafka_ws.consumer;


import com.pradeep.kafka_ws.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaMessageListener {



    @KafkaListener(topics = "KafkaTopic10",groupId = "kafConsGrp1")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }
    /*@KafkaListener(topics = "KafkaTopic10",groupId = "kafConsGrp1")
    public void consumer2(String  message) {
        log.info("consumer2 consume the message {} ", message);
    }

    @KafkaListener(topics = "KafkaTopic10",groupId = "kafConsGrp1")
    public void consumer3(String  message) {
        log.info("consumer3 consume the message {} ", message);
    }

    @KafkaListener(topics = "KafkaTopic10",groupId = "kafConsGrp1")
    public void consumer4(String  message) {
        log.info("consumer4 consume the message {} ", message);
    }*/
}
