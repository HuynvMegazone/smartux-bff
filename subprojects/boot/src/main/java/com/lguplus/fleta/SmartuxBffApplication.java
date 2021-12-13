package com.lguplus.fleta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SmartuxBffApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartuxBffApplication.class, args);
    }
}
