package com.yi.dao;

import com.yi.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yisy
 * @date 2020-03-11
 */
//@Mapper
@Repository
public interface UserDao {
    /**
     * 查询用户信息
     * @return User
     */
    List<User> selectUserMessage();
}
