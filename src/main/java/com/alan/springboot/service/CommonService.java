package com.alan.springboot.service;

import com.alan.springboot.dao.CommonDao;
import com.alan.springboot.domain.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Alan
 * @create: 2019-01-25 15:48
 **/
@Service
public class CommonService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private CommonDao commonDao;

    public List<Map<String,String>> ececuteSql(String sql){
        List<Map<String,Object>> exeList=commonDao.executeSql(sql);
        List<Map<String,String>> reList=new ArrayList<Map<String, String>>();
        for (Map<String,Object> exeMap:exeList) {
            Map<String,String> reMap=new HashMap<String, String>();
            for (Map.Entry<String,Object> entry:exeMap.entrySet()){
                reMap.put(entry.getKey(),entry.getValue().toString());
                reList.add(reMap);
            }
        }
        return reList;
    }

    public  double getNum(String sql){
        return commonDao.getDouble(sql);
    }

    public String getString(String sql){
        return commonDao.getString(sql);
    }

    public  List<Map<String,Object>>  jdbcSql(String sql){
        return jdbcTemplate.queryForList(sql);
    }



}
