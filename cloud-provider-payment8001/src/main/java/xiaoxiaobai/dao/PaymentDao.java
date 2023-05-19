package xiaoxiaobai.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xiaoxiaobai.entities.Payment;

/**
 * @Author: hys
 * @createTime: 2023年05月18日 18:22:07
 * @version: 1.0.0
 * @Description: PaymentDao
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
