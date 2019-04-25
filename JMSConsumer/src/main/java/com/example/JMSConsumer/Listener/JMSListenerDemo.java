package com.example.JMSConsumer.Listener;

import com.example.JMSConsumer.beans.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by np85075 on 4/24/2019.
 */
@Component
public class JMSListenerDemo {

    @JmsListener(destination = "standalone.queue")
    public void consume(String message) throws IOException {

            Employee e = new ObjectMapper().readValue(message,Employee.class);


        System.out.println(e);
    }
}
