package com.dyq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-22 20:06
 */
@Configuration
public class InceptorClss extends WebMvcConfigurerAdapter {
    @Autowired
    private UserInterceptor userInterceptor;
     //UserInterceptor userInterceptor =new UserInterceptor();
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor)
        .addPathPatterns("/user/**")
        .excludePathPatterns("/user/queryAll");
    }
}
