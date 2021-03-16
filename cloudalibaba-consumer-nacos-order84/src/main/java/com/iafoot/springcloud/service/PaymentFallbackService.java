package com.iafoot.springcloud.service;

import com.iafoot.springcloud.entities.CommonResult;
import com.iafoot.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/16 19:04
 */
@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult<Payment> getServerPort(Long id) {
        return new CommonResult<>(44444,"服务降级返回，---PaymentFallbackService",new Payment(id,"erroeService"));
    }


















}
