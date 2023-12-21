package com.jgsoft.producer.controller;

import com.jgsoft.producer.producer.KafkaProducer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {

    private KafkaProducer kafkaProducer;

    public KafkaProducerController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/new", produces = MediaType.TEXT_PLAIN_VALUE)
    public String writeText(@RequestBody final String message) {
        kafkaProducer.sendMessage(message);
        return message;
    }
}
