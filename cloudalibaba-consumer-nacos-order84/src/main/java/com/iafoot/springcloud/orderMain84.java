package com.iafoot.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/10 20:36
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class orderMain84 {
    public static void main(String[] args) {
        SpringApplication.run(orderMain84.class,args);
    }
}
