package com.iafoot.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/3 18:57
 */
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain80 {
    public static void main(String[] args) {

        SpringApplication.run(OrderHystrixMain80.class,args);
    }
}
