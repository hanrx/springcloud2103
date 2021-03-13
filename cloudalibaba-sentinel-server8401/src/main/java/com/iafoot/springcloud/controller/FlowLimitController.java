package com.iafoot.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/13 16:43
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "----------testA----------";
    }

    @GetMapping("/testB")
    public String testB(){
        return "----------testB----------";
    }

}
