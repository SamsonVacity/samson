package com.samson;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.samson.dao")
public class SamsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamsonApplication.class, args);
    }

}
