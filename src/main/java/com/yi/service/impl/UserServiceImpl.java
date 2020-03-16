package com.yi.service.impl;

import com.yi.dao.UserDao;
import com.yi.po.User;
import com.yi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yisy
 * @date 2020-03-11
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> selectUserMessage() {
        return userDao.selectUserMessage();
    }
}
