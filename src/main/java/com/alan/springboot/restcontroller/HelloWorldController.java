package com.alan.springboot.restcontroller;

import com.alan.springboot.base.BaseController;
import com.alan.springboot.domain.User;
import com.alan.springboot.service.UserService;
import com.alan.springboot.util.WorkProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController extends BaseController {


    @Autowired
    private UserService userService;
    @Autowired
    private  WorkProperties workProperties;
    @Autowired
    private Environment env;
    @Value("${com.alan.code}")
    private  String propertyCode;

    @GetMapping(value = "/hello" )
    public String index() {
        LOGGER.info(workProperties.getTitle());
        return "hello world中国"+ workProperties.getTitle()+env.getProperty("com.alan.age")+propertyCode+env.getProperty("com.alan.add");
    }

    @RequestMapping(value="/getUser",produces = "application/json;charset=UTF-8")
    public User getUser() {
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }
    @RequestMapping(value = "addUser")
    public User addUser(){
        User user=new User();
        user.setUserName("Alan");
        user.setPassWord("aaaaaa");
        user.setCode("alan");
        user.setPhoneNum("11111");
        user.setEmail("aaaaa@163.com");
        return userService.saveUser(user);

    }

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        return userService.getAllList();
    }
}
