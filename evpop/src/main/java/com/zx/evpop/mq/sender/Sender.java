package com.zx.evpop.mq.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: jml
 * @Date: 18-11-1
 * @Description:
 */
@Component
public class Sender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {
        String context = "hello" + new Date();
        System.out.println("Sender :" + context);
        this.rabbitTemplate.convertAndSend("rabbit-queue", context);
    }
}
