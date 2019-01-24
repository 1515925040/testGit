package com.dyq.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-22 17:37
 */
@Component
public class springTaskTest {
    @Scheduled(fixedDelay = 3000)
    public void test1(){
        System.out.println("test1"+new Date());
    }
    @Scheduled(fixedRate = 2000,initialDelay = 3000)
    public void test2(){
        System.out.println("test()2"+new Date());
    }
}
