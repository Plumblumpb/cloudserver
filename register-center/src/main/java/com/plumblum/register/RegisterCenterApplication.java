package com.plumblum.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: cpb
 * @Date: 2019/1/9 09:29
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterApplication.class,args);
    }

}
