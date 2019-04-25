package com.example.JMSConsumer.Listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by np85075 on 4/24/2019.
 */
@Component
public class JMSListenerDemo {

    @JmsListener(destination = "standalone.queue")
    public void consume(String message){
        System.out.println(message);
    }
}
