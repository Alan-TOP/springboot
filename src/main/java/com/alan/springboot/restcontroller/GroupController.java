package com.alan.springboot.restcontroller;

import com.alan.springboot.domain.Group;
import com.alan.springboot.service.CommonService;
import com.alan.springboot.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Alan
 * @create: 2019-01-22 11:05
 **/
@RestController
public class GroupController {
    @Autowired
    private GroupService groupService;

    @Autowired
    private CommonService commonService;

    @RequestMapping("/save")
    public Group saveGroup(){
        Group group =new Group();
        group.setCode("code");
        group.setName("name");
        group.setState("1");
        return  groupService.save(group);
    }

    @RequestMapping("/getGroup")
    public List<Map<String,String>> getGroup(){
        String sql="select * from sys_group";
        return commonService.ececuteSql(sql);
    }
    @RequestMapping("/getGroupJdbc")
    public List<Map<String,Object>> getGroupJdbc(){
        String sql="select * from sys_group";
        return commonService.jdbcSql(sql);
    }
}
