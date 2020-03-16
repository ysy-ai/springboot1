package com.yi.service;

import com.yi.po.User;

import java.util.List;

/**
 * @author yisy
 * @date 2020-03-11
 */
public interface UserService {
    /**
     * 查询用户信息
     * @return User
     */
    List<User> selectUserMessage();
}
