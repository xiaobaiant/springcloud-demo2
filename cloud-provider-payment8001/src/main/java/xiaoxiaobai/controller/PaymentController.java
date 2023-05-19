package xiaoxiaobai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import xiaoxiaobai.common.CommonResult;

import xiaoxiaobai.entities.Payment;
import xiaoxiaobai.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: hys
 * @createTime: 2023年05月18日 18:22:41
 * @version: 1.0.0
 * @Description: PaymentController
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;


    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort: " + result);
        } else {
            return new CommonResult(444, "插入数据库失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果---------------->" + payment.toString());
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort:  " + payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID: " + id);
        }
    }
}
