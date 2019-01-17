package com.alan.springboot.service;

import com.alan.springboot.dao.UserDao;
import com.alan.springboot.domain.User;
import com.alan.springboot.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User saveUser(User user){
        if (user.getId()==null){
                user.setCreateTime(DateUtil.getNowDate());
            }
            user.setUpdateTime(DateUtil.getNowDate());
        return  userDao.save(user);
    }

    public User getUser(int id){
        return  userDao.getOne(id);
    }
    public void deleteUser(int id){
         userDao.deleteById(id);
    }

    public User getUser(){
        User user=new User();
        user.setUserName("小明service");
        user.setPassWord("xxxx");
        return user;
    }
    public List<User> getAllList(){
         return userDao.findAll();
    }

    public List<User> getUserByName(String name){
        return userDao.getUserLikeName(name);
    }
    public User getOneBySql(int id){
        return userDao.getOneBySql(id);
    }


    /*Page<User> userPage =
            userDao.queryUsers(2, PageRequest.of(0, 10, Sort.by(Sort.Order.desc("gmtCreate"))));*/
}
