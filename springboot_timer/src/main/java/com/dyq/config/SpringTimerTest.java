package com.dyq.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-22 19:07
 */
@Async//异步线程标志
@Component
public class SpringTimerTest {
   /* @Scheduled(fixedDelay = 3000)
    public void test(){
        System.out.println("test1:"+new Date());
    }
    @Scheduled(initialDelay = 4000,fixedRate = 2000)
    public void test2(){
        System.out.println("test2():"+new Date());

    }
    @Scheduled(cron = "0 * * * * ?")
    public void test3(){
        System.out.println("test()3:"+new Date());
    }*/

    @Scheduled(fixedDelay = 3000)
    public void test01() throws InterruptedException {
        //System.out.println("task1 :"+new Date());
        Thread thread = Thread.currentThread();
        Thread.sleep(5000);
        String name = thread.getName();
        //System.out.println(name);
    }
    @Scheduled(fixedRate = 3000,initialDelay = 3000)
    public void test02(){
    //System.out.println("task2 :"+new Date());
    }

}
