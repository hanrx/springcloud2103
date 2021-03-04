package com.iafoot.springcloud.service;

import com.iafoot.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/3/4 11:15
 * 重新了
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService------- fall back , paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService------- fall back , paymentInfo_TimeOut";
    }
}
