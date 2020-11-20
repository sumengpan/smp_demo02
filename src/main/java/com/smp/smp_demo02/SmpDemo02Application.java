package com.smp.smp_demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.smp.smp_demo02.dao")//扫描接口
public class SmpDemo02Application {

    public static void main(String[] args) {
        SpringApplication.run(SmpDemo02Application.class, args);
    }

}
