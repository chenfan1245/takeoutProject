package com.cykj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cykj.mapper")
public class TakeoutUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeoutUserApplication.class, args);
        System.out.println("http://localhost:9904");
    }

}
