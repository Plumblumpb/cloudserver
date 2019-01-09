package com.plumblum.log.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @Auther: cpb
 * @Date: 2019/1/9 10:45
 * @Description:
 */
@EnableAsync(proxyTargetClass = true)
@Configuration
public class AsycTaskExecutorConfig {
    @Bean
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(50);
        taskExecutor.setMaxPoolSize(100);

        return taskExecutor;
    }
}
