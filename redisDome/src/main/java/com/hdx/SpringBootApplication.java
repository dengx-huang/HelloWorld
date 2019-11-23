package com.hdx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@org.springframework.boot.autoconfigure.SpringBootApplication(scanBasePackages = {"com.hdx.bean",
"com.hdx.controller","com.hdx.service","com.hdx.dao","com.hdx"})
@EnableTransactionManagement
@MapperScan("com.hdx.dao")
@ImportResource("classpath:mapping/*.xml")
public class SpringBootApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringBootApplication.class, args);

    }

}
