package com.iafoot.springcloud.controller;

import com.iafoot.springcloud.entities.CommonResult;
import com.iafoot.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/10 20:02
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static {
        hashMap.put(1L,new Payment(1L,"111111111111111111111"));
        hashMap.put(2L,new Payment(2L,"2222222222222222222222"));
        hashMap.put(3L,new Payment(3L,"33333333333333333333333"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> getServerPort(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<Payment>(200,"from mysql,serverPort:"+serverPort,payment);
        return result;
    }






























}
