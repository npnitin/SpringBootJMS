package com.example.JMSConsumer.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Queue;

/**
 * Created by np85075 on 4/24/2019.
 */
@Configuration
public class JMSConfig {

    @Value("${activemq.broker-url}")
    private String brokerUrl;

    @Bean
    public Queue queue(){
        return new ActiveMQQueue("standalone.queue");
    }

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory(){
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL(brokerUrl);
        return activeMQConnectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate(){
        return new JmsTemplate(activeMQConnectionFactory());
    }
}
