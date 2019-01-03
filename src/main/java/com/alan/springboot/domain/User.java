package com.alan.springboot.domain;

import javax.persistence.*;
@Entity
@Table(name = "sys_users")
public class User extends BaseEntity{

    @Column(name = "CODE")
    private  String code;
    @Column(name = "USERNAME")
    private  String userName;
    @Column(name = "PASSWORD")
    private  String passWord;
    @Column(name = "PHONENUM")
    private  String phoneNum;
    @Column(name = "EMAIL")
    private  String email;

    public User() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
