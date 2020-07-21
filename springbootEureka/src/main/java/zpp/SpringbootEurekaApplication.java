package zpp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: 张平平
 * @Date: 2020/7/20 14:50
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringbootEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaApplication.class,args);
    }
}
