package com.alan.springboot.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * SQL执行基础类
 */
@Mapper
public interface CommonDao {
    /**
     * 执行SQL，返回List
     * @param exeSql
     * @return
     */
    List<Map<String,Object>> executeSql(String exeSql);

    double getDouble(String sql);

    String getString(String sql);
}
