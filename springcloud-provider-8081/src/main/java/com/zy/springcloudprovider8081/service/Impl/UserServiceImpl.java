package com.zy.springcloudprovider8081.service.Impl;

import com.zy.springcloudapi.entites.User;
import com.zy.springcloudprovider8081.dao.UserMapper;
import com.zy.springcloudprovider8081.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User get(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
