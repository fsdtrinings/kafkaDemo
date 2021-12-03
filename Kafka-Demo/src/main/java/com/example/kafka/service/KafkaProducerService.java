package com.example.kafka.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate; 
import org.springframework.stereotype.Service;

import com.example.kafka.commons.AppConstants;

 
@Service
public class KafkaProducerService 
{
    
     
    @Autowired
    private KafkaTemplate<String, String> kafkaMsgTemplate;
 
    public void sendMessage(String message) 
    {
       System.out.println("\n\n\n===== >> From Producer Service "+message+" Sent \n\n\n");
        this.kafkaMsgTemplate.send(AppConstants.TOPIC_NAME, message);
    }
}