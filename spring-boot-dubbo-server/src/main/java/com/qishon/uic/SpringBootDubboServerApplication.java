package com.qishon.uic;

import com.qishon.spring.boot.dubbo.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringBootDubboServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboServerApplication.class, args);
    }
}
