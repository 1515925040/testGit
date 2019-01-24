package com.dyq.controller;

import com.dyq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-22 20:12
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryAll")
    public String queryAll(){
        System.out.println("controller:queyAll");
        return "hello Word!";
    }

    @RequestMapping("/insert")
    public String  insert(){
        System.out.println("insert执行");
        return "insert";
    }

}
