package com.alan.springboot.controller;

import com.alan.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    /**
     * 查询所用用户
     * @return
     */
    @GetMapping(value = "/userList")
    public ModelAndView list(Model model) {

        model.addAttribute("userList", userService.getAllList());
        model.addAttribute("title", "用户管理a");
        return new ModelAndView("list", "userModel", model);
    }
}
