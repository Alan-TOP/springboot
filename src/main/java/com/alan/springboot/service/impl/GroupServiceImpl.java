package com.alan.springboot.service.impl;

import com.alan.springboot.base.baseutil.PrimaryKeyUtil;
import com.alan.springboot.base.impl.BaseServiceImpl;
import com.alan.springboot.dao.GroupDao;
import com.alan.springboot.domain.Group;
import com.alan.springboot.service.GroupService;
import com.alan.springboot.util.DateUtil;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Alan
 * @create: 2019-01-22 10:28
 **/
@Service("GroupService")
public class GroupServiceImpl extends BaseServiceImpl<GroupDao,Group> implements GroupService{
    @Override
    public Group save(Group group) {
        if (group!=null&&group.getId()!=null){
            group.setLastUpdateTime(DateUtil.getNowDate());
            this.updateByPrimaryKey(group);
        }else {
            group.setId(PrimaryKeyUtil.getUUID());
            group.setCreateTime(DateUtil.getNowDate());
            group.setLastUpdateTime(DateUtil.getNowDate());
            this.insert(group);
        }
        return  group;
    }
}
