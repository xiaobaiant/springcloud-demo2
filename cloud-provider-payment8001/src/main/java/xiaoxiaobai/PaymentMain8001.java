package xiaoxiaobai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: hys
 * @createTime: 2023年05月17日 18:40:42
 * @version: 1.0.0
 * @Description: Eureka服务消费者
 */
@SpringBootApplication
//服务消费者
@EnableEurekaClient
public class  PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);

    }
}
