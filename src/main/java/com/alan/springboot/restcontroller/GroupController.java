package com.alan.springboot.restcontroller;

import com.alan.springboot.domain.Group;
import com.alan.springboot.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Alan
 * @create: 2019-01-22 11:05
 **/
@RestController
public class GroupController {
    @Autowired
    private GroupService groupService;
    @RequestMapping("/save")
    public Group getGroup(){
        Group group =new Group();
        group.setCode("code");
        group.setName("name");
        group.setState("1");
        return  groupService.save(group);
    }
}
