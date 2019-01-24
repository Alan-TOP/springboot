package com.alan.springboot.dao;

import com.alan.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserDao extends JpaRepository<User,Integer>{

    @Query(value = "select * from sys_users  where userName like %:name%",nativeQuery = true)
    List<User> getUserLikeName(@Param("name") String name);
    //注意：Idea中使用JPA原生sql查询时需要配置好Database的数据源，指定数据库方言，指定Schema
    //使用 @Query 注解标记在Repository方法上可以使用JPQL进行查询
   /* @Query(value = "select u from sys_users u where u.id = ?1")
    User getOneByJpql(String id);*/

    //也可以使用原生SQL查询，不过要把设置 nativeQuery = true
    @Query(value = "select * from sys_users where id =:id", nativeQuery = true)
    User getOneBySql(@Param("id") Integer id);

    /*
    //现在重新来看上面分页查询加条件查询，利用@Query是如何轻松的解决的
    @Query(value ="select u from User u where u.id > :id")
    Page<User> queryUsers(@Param("id") Integer id, Pageable pageable);

    //@Query允许SQL更新、删除语句，但必须搭配 @Modifying 使用
    @Modifying
    @Query(value = "update User u set u.name = ?1 where u.id = ?2")
    int update(String name, Integer id);*/

}
