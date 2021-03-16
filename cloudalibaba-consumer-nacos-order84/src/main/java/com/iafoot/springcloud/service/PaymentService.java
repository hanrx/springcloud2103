package com.iafoot.springcloud.service;

import com.iafoot.springcloud.entities.CommonResult;
import com.iafoot.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> getServerPort(@PathVariable("id") Long id) ;
}
