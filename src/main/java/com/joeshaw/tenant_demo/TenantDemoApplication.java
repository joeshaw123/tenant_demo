package com.joeshaw.tenant_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(value = {"com.joeshaw.tenant_demo.mapper"})
public class TenantDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TenantDemoApplication.class, args);
    }

}
