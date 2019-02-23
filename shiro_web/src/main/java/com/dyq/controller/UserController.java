package com.dyq.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-02-08 21:29
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("userlogin")
    public String loginUser(String username,String password){
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken token  = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
            return "index";
        }catch (UnknownAccountException e){
            //e.printStackTrace();
            System.out.println("账号错误");
            return "/login";
        }catch (IncorrectCredentialsException e){
            System.out.println("密码错误");
            return "/login";
        }
    }
}
