package com.meteergin.springboot.rabbitmq.consumer.listener;

import com.meteergin.springboot.rabbitmq.consumer.config.MQConfig;
import com.meteergin.springboot.rabbitmq.consumer.entity.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author mergin
 */
@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }

}
