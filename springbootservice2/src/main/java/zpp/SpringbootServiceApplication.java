package zpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Author: 张平平
 * @Date: 2020/7/20 14:50
 */
@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@RefreshScope //开启配置更新功能
public class SpringbootServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootServiceApplication.class,args);
    }
}
