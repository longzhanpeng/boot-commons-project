package com.lung.application.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * 消息的消费者
 *
 * @author longzhanpeng longzhanpeng@3vjia.com
 * @since 2019-07-08 15:27
 */
@Component
@Slf4j
public class UserLogConsumer {

    /**
     * 消息的消费处理端
     *
     * @param consumerRecord
     * @return void
     * @author longzhanpeng longzhanpeng@3vjia.com
     * @since 2019/7/8
     */
    @KafkaListener(topics = {"userLog"})
    public void consumer(ConsumerRecord<?, ?> consumerRecord) {
        //判断是否为null
        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        log.info(">>>>>>>>>> record =" + kafkaMessage);
        if (kafkaMessage.isPresent()) {
            //得到Optional实例中的值
            Object message = kafkaMessage.get();
            System.err.println("消费消息:" + message);
        }
    }
}