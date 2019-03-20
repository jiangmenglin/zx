package com.zx.evpop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zx.evpop.jdbc.dao")
public class EvpopApplication {

    public static void main(String[] args) {
        SpringApplication.run(EvpopApplication.class, args);
    }
}
