package com.alan.springboot.service;

import com.alan.springboot.base.BaseService;
import com.alan.springboot.domain.Group;

/**
 * @description:
 * @author: Alan
 * @create: 2019-01-22 10:26
 **/
public interface GroupService extends BaseService<Group> {

    Group save(Group group);
}
