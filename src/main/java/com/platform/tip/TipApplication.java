package com.platform.tip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.platform.tip.mapper")
public class TipApplication {
    public static void main(String[] args) {
        SpringApplication.run(TipApplication.class, args);

    }

}
