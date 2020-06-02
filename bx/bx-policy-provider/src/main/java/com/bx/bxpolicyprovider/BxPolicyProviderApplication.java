package com.bx.bxpolicyprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class BxPolicyProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BxPolicyProviderApplication.class, args);
    }

}
