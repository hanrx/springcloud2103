package com.iafoot.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/15 20:48
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9004.class,args);
    }
}
