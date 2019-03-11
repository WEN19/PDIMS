package com.example.demo.controller;
 

 
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
 
@Controller
@RequestMapping(value = {"/user"})
public class UserController {
 
    /**
     * 注入service
     */
    @Autowired
    private UserService userService;
 
    /**
     * 跳转到用户登录页面
     * @return 登录页面
     */
    @RequestMapping(value = {"/loginHtml"})
    public String loginHtml(){
        return "index1";
    }
 
   
    /**
     * 获取用户名与密码，用户登录
     * @return 登录成功页面
     */
    @RequestMapping(value = {"/userLogin"})
    public String userLogin(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request){
    	
        User user = userService.userLogin(username,password);
 
        if(user != null){                                             //登录成功
            request.getSession().setAttribute("session_user",user);     //将用户信息放入session
            return "home";
        }
        return "loginError";
    }
 
   
}