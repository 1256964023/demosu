package com.cykj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cykj.mapper")
public class VueServletApplication {
    public static void main(String[] args) {
        SpringApplication.run(VueServletApplication.class, args);
    }

}
