package com.example.kafka.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.service.KafkaProducerService;

 
@RestController
@RequestMapping(value = "/kafka")
public class WebController 
{
	@Autowired
    private KafkaProducerService producerService;
 
 
    @PostMapping(value = "/do")
    public String sendMessageToKafkaTopic(@RequestParam("msg") String message) 
    {
        this.producerService.sendMessage(message);
        return "topic sent!!";
    }
}