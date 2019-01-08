package com.alan.springboot.controller;

import com.alan.springboot.domain.User;
import com.alan.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    /**
     * 查询所用用户
     * @return
     */
    @GetMapping("userList")
    public String list(Model model) {
        model.addAttribute("userList", userService.getAllList());
        model.addAttribute("title", "用户管理");
        return "list";
    }
    /**
     * 获取 form 表单页面
     * @return
     */
    @GetMapping("/form")
    public String createForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("title", "创建用户");
        return "form";
    }

    /**
     * 新建用户
     * @param user
     * @return
     */
    @PostMapping("saveUser")
    public String create(User user,Model model) {
        user = userService.saveUser(user);
        model.addAttribute("user",user);
        return "form";
    }
    /**
     * 根据id查询用户
     * @return
     */
    @GetMapping(value = "view")
    public String view(@PathParam("id") int id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "查看用户");
        return "view";
    }
    /**
     * 删除用户
     * @param id
     * @return
     */
    @GetMapping(value = "delete/{id}")
    public ModelAndView delete(@PathVariable("id") int id) {
        ModelAndView model =new ModelAndView();
        userService.deleteUser(id);
        model.addObject("userList", userService.getAllList());
        model.addObject("title", "删除用户");
        model.setViewName("list");
        return model;
    }

    /**
     * 修改用户
     */
    @GetMapping(value = "edit/{id}")
    public String modifyForm(@PathVariable("id") int id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "修改用户");
        return "form";
    }






    @GetMapping(value = "/listTest")
    public String listTest(Model model) {
        model.addAttribute("userList", userService.getAllList());
        model.addAttribute("title", "用户管理a");
        return "list";
    }

    @GetMapping(value = "/userListTest")
    public ModelAndView listUserTest(Model model) {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("list");
        modelAndView.addObject("userList",userService.getAllList());
        modelAndView.addObject("title","用户管理");
        return modelAndView;
    }
}
