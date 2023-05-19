package xiaoxiaobai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: hys
 * @createTime: 2023年05月18日 18:16:22
 * @version: 1.0.0
 * @Description: ApplicationContextConfig
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
