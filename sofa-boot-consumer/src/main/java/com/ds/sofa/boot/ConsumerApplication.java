package com.ds.sofa.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ds
 * @date 2025/3/26 23:26
 */
@EnableFeignClients
@SpringBootApplication(excludeName = {"serverPropertiesAutoConfiguration"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
