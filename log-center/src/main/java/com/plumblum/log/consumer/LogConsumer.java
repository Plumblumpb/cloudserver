package com.plumblum.log.consumer;

import com.plumblum.log.service.LogService;
import com.plumblum.model.log.Log;
import com.plumblum.model.log.constants.LogQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: cpb
 * @Date: 2019/1/9 10:38
 * @Description:
 */
@Component
@RabbitListener(queues = LogQueue.LOG_QUEUE)
public class LogConsumer {
    private static final Logger logger = LoggerFactory.getLogger(LogConsumer.class);

    @Autowired
    private LogService logService;

    /**
     * 处理消息
     *
     * @param log
     */
    @RabbitHandler
    public void logHandler(Log log) {
        try {
            logService.save(log);
        } catch (Exception e) {
            logger.error("保存日志失败，日志：{}，异常：{}", log, e);
        }

    }
}
