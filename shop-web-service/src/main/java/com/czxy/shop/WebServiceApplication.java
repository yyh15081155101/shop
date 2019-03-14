package com.czxy.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Pupupupupu on 2019/2/28.
 */
@SpringBootApplication
@EnableDiscoveryClient  //eureka客户端
public class WebServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebServiceApplication.class,args);
    }
}
