package com.tt.mq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: jml
 * @Date: 18-11-1
 * @Description:
 */
@Component
public class Receiver {

    @RabbitListener(queues = "rabbit-queue")
    @RabbitHandler
    public void process(String message) {
        System.out.println("Receiver:" + message);
    }
}
