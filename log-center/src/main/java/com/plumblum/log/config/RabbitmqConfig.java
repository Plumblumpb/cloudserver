package com.plumblum.log.config;

import com.plumblum.model.log.constants.LogQueue;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: cpb
 * @Date: 2019/1/9 10:40
 * @Description:
 */
@Configuration
public class RabbitmqConfig {

    /**
     * 声明队列
     *
     * @return
     */
    @Bean
    public Queue logQueue() {
        Queue queue = new Queue(LogQueue.LOG_QUEUE);
        return queue;
    }
}
