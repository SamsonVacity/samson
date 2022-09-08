package com.samson.dao;

import com.samson.entity.SamsonUsers;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员DAO
 * @author su.maosen
 */
@Mapper
public interface SamsonUsersDao {

    /**
     * 用户登录
     */
    SamsonUsers selectByName(String name);



}