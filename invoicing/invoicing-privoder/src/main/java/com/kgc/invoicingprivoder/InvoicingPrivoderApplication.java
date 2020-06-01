package com.kgc.invoicingprivoder;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class InvoicingPrivoderApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvoicingPrivoderApplication.class, args);
    }

}
