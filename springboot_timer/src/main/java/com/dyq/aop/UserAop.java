package com.dyq.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-22 19:31
 */
@Aspect
@Configuration
public class UserAop {
    @Before("execution(* com.dyq.service.*.*(..))")
    public void test(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("前置aop通知"+name);
    }
    @After("execution(* com.dyq.service.*.*(..))")
    public void test2(){
        System.out.println("后置通知：aop");
    }
    @Around("execution(* com.dyq.service.*.*(..))")
    public Object test3(ProceedingJoinPoint proceedingJoinPoint){
        try {
            System.out.println("环绕前aop：");
                Object proceed = proceedingJoinPoint.proceed();
                String name = proceedingJoinPoint.getSignature().getName();
                String s = proceedingJoinPoint.getSignature().toString();
            System.out.println("环绕通知后aop："+name+"==="+s);//name为方法名，getSignature()方法的全路径
            return proceed;
        }catch (Throwable throwable){
            throwable.printStackTrace();
                return null;
        }

    }
}
