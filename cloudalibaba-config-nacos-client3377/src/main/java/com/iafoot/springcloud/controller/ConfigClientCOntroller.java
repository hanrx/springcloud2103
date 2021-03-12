package com.iafoot.springcloud.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/11 19:03
 */
@RestController
@RefreshScope //支持Nacos的动态刷新功能
public class ConfigClientCOntroller {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return  configInfo;
    }














}
