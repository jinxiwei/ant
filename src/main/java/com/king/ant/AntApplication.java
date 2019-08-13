package com.king.ant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement// 开启事务管理
@MapperScan(basePackages = "com.king.ant.dao")// mapper扫描
@EnableAsync// 开启多线程支持
@SpringBootApplication
public class AntApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntApplication.class, args);
    }

}
