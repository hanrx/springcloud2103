package com.iafoot.springcloud.controller;

import com.iafoot.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/9 10:11
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;
    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }



















}
