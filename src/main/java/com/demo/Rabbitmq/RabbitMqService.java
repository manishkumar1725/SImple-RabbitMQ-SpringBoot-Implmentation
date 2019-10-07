package com.demo.Rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RabbitMqService {
	
	
	@Autowired
    private AmqpTemplate amqpTemplate;

    private String exchange = "data-exchange";

    private String routingkey = "model";

    public void sendMessage(Model model) {
        amqpTemplate.convertAndSend(exchange, routingkey, model);
    }
}

//  AMQP is made up of Exchanges, Queues, and Bindings:
//  AMQP provides a "template" as a high-level abstraction for sending and receiving messages. 
//  It also provides support for Message-driven POJOs with a "listener container"

//  Message Publishing – we use a AMQPTemplate/RabbitMqTemplate to send messages