package zpp;

/**
 * @Author: 张平平
 * @Date: 2020/7/20 15:57
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootConfigApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringbootConfigApplication.class, args);
    }
}
