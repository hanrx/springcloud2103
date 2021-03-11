package com.iafoot.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/10 20:36
 */
@SpringBootApplication
@EnableDiscoveryClient
public class orderMain83 {
    public static void main(String[] args) {
        SpringApplication.run(orderMain83.class,args);
    }
}
