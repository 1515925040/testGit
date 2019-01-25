package com.dyq.service;

import org.springframework.stereotype.Service;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-22 19:30
 */
@Service
public class UserServiceImpl implements  UserService {
    @Override
    public void test01() {
        System.out.println("test1()方法");
    }
}
