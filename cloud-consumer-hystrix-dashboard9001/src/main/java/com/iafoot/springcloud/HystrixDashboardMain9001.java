package com.iafoot.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/5 08:48
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {

        SpringApplication.run(HystrixDashboardMain9001.class,args);
    }
}
