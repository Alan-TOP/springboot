package com.alan.springboot.restcontroller;

import com.alan.springboot.domain.User;
import com.alan.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/hello" )
    public String index() {
        return "hello world中国";
    }

    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }
    @RequestMapping("/getUsers")
    public User getUsers() {
        return userService.getUser();
    }
}
