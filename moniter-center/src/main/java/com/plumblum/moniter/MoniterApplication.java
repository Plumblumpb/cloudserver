package com.plumblum.moniter;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: cpb
 * @Date: 2019/1/9 10:01
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class MoniterApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoniterApplication.class,args);
    }
}
