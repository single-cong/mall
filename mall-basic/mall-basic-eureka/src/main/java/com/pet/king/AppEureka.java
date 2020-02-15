package com.pet.king;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description 分布式基础设施之Eureka
 * @Author single-聪
 * @Date 23:05 2020/2/14
 * @Version 1.0.1
 * @return
 **/
@SpringBootApplication
@EnableEurekaServer
public class AppEureka {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka.class, args);
    }
}
