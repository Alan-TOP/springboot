package com.alan.springboot.base.impl;

import com.alan.springboot.base.BaseDao;
import com.alan.springboot.base.BaseService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Alan
 * @create: 2019-01-22 09:50
 **/
@Service("BaseService")
public class BaseServiceImpl<D extends BaseDao<T>,T> implements BaseService<T> {

    protected D dao;

    @Override
    public int deleteByPrimaryKey(String id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(T record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return dao.insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(String id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return dao.updateByPrimaryKey(record);
    }

}
