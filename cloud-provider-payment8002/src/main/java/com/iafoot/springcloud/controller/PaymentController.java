package com.iafoot.springcloud.controller;

import com.iafoot.springcloud.entities.CommonResult;
import com.iafoot.springcloud.entities.Payment;
import com.iafoot.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/2/27 17:56
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info(">>>>>>>>>插入结果： "+result);
        if (result > 0) {
            return new CommonResult(200,"插入数据库成功,serverPort: "+serverPort,result);
        }else {
            return new CommonResult(200,"插入数据库失败,serverPort:"+serverPort);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info(">>>>>>>>>查询结果： "+payment);
        if (payment !=null) {
            return new CommonResult(200,"查查成功,serverPort:"+serverPort,payment);
        }else {
            return new CommonResult(200,"没有对应记录，查询ID: "+ id,null);
        }
    }














}
