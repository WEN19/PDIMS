package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
@Service
public class UserService {
	 @Autowired
	    private UserMapper usermapper;
	 
	    //用户登录
	    public User userLogin(String username,String password){
	        User user = usermapper.userlogin(username,password);
	        return user;
	    }
	 
	    //注册新用户


}
