package com.example.JMSProducer.Controller;

import com.example.JMSProducer.beans.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public String getMessage(@RequestParam("message") String message) throws JsonProcessingException {
        jmsTemplate.convertAndSend(queue,new ObjectMapper().writeValueAsString(new Employee(10,"Nitin Pawar",50000,message)));
        return " published sucessfully!!!";
    }
}
