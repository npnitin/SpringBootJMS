package com.example.JMSProducer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;


/**
 * Created by np85075 on 4/24/2019.
 */
@RestController
@RequestMapping("/producer")
public class MessageController {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;

    @GetMapping()
    public String getMessage(@RequestParam("message") String message){
        jmsTemplate.convertAndSend(queue,message);
        return message+" published sucessfully!!!";
    }
}
