package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.example.dao.mapper")
public class HbmsSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HbmsSystemApplication.class, args);
    }

}
