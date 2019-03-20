package com.zx.evpop;

import com.zx.evpop.mq.receiver.Receiver;
import com.zx.evpop.mq.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: jml
 * @Date: 18-11-1
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqTest {
    @Autowired
    private Sender sender;

    @Autowired
    private Receiver receiver;

    private final static String QUEUE_NAME = "rabbit-queue";

    @Test
    public void testSend() {
        sender.send();
    }
}
