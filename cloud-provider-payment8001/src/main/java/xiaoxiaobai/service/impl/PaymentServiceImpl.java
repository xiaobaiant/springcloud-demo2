package xiaoxiaobai.service.impl;

import org.springframework.stereotype.Service;
import xiaoxiaobai.dao.PaymentDao;
import xiaoxiaobai.entities.Payment;
import xiaoxiaobai.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: hys
 * @createTime: 2023年05月18日 18:24:13
 * @version: 1.0.0
 * @Description: PaymentServiceImpl
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
