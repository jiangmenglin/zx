package com.zx.evpop.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: jml
 * @Date: 18-11-1
 * @Description:
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue myQueue() {
        return new Queue("rabbit-queue");
    }
}
