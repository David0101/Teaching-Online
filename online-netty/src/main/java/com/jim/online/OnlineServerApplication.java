package com.jim.online;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: teaching-online
 * @author: jim
 * @create: 2020-09-21 14:36
 */
@EnableTransactionManagement
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.jim")
@Slf4j
@EnableAsync
public class OnlineServerApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(OnlineServerApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.addListeners(new CloseApplicationHandler());
        app.run(args);
        log.info("OnlineServerApplication run !!");
    }
}
