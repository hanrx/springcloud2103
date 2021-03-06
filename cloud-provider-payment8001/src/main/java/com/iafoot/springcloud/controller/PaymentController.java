package com.iafoot.springcloud.controller;

import com.iafoot.springcloud.entities.CommonResult;
import com.iafoot.springcloud.entities.Payment;
import com.iafoot.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.nio.channels.InterruptedByTimeoutException;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Resource//服务发现
    private DiscoveryClient discoveryClient;

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

    //服务发现
    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element: services) {
            log.info("******element:"+element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-SERVICE");
        for (ServiceInstance instance: instances) {
            log.info(instance.getInstanceId()+"\t"+instance.getHost()+"/t"+instance.getPort()+"/t"+instance.getUri());
        }
        return discoveryClient;
    }
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
        return serverPort;
    }
    @GetMapping(value = "payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }









}
