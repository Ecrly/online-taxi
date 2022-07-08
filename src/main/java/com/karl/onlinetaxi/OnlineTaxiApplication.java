package com.karl.onlinetaxi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.karl.onlinetaxi.*.mapper")
@SpringBootApplication
public class OnlineTaxiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineTaxiApplication.class, args);
    }

}
