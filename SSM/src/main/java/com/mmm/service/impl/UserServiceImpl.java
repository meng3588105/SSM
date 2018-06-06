package com.mmm.service.impl;

import com.mmm.bean.User;
import com.mmm.dao.UserMapper;
import com.mmm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(String name, String pwd) {
        return userMapper.login(name, pwd);
    }
}
