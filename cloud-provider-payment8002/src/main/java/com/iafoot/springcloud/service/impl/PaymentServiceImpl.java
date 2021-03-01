package com.iafoot.springcloud.service.impl;

import com.iafoot.springcloud.dao.PaymentDao;
import com.iafoot.springcloud.entities.Payment;
import com.iafoot.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：iAfoot
 * @description：TODO
 * @date ：2021/2/27 17:51
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    //Java 自带注入注解
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
