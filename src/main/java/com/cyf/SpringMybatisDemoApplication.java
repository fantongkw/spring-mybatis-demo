package com.cyf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cyf.mapper")
public class SpringMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisDemoApplication.class, args);
    }
}
