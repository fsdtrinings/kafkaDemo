package com.example.kafka.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.example.kafka.commons.AppConstants;

 
@Service
public class KafkaConsumerService 
{

 
    @KafkaListener(topics = AppConstants.TOPIC_NAME, 
            groupId = AppConstants.GROUP_ID)
    public void consume(String message) 
    {
        
        System.out.println("\n\n\n===== >> Consumer Recevies "+message+" \n\n\n");
    }
}