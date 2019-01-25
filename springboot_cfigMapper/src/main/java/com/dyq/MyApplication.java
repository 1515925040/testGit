package com.dyq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-21 21:06
 */
@SpringBootApplication
@MapperScan(value = "com.dyq.dao")
@EnableScheduling
public class MyApplication {

    public static void main(String[] args) {
        System.out.println(1);
        SpringApplication.run(MyApplication.class,args);
    }
}
