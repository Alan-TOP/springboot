package com.alan.springboot.dao;

import com.alan.springboot.base.BaseDao;
import com.alan.springboot.domain.Group;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GroupDao extends BaseDao<Group> {

}