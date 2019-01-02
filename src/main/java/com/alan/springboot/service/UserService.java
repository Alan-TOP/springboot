package com.alan.springboot.service;

import com.alan.springboot.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(){
        User user=new User();
        user.setUserName("小明service");
        user.setPassWord("xxxx");
        return user;
    }
}
