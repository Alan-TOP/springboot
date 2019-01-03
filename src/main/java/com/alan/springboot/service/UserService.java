package com.alan.springboot.service;

import com.alan.springboot.dao.UserDao;
import com.alan.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(){
        User user=new User();
        user.setUserName("小明service");
        user.setPassWord("xxxx");
        return user;
    }
    public List<User> getAllList(){
         return userDao.findAll();
    }

    /*Page<User> userPage =
            userDao.queryUsers(2, PageRequest.of(0, 10, Sort.by(Sort.Order.desc("gmtCreate"))));*/
}
