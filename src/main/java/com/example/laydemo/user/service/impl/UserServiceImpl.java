package com.example.laydemo.user.service.impl;

import com.example.laydemo.user.entity.User;
import com.example.laydemo.user.mapper.UserMapper;
import com.example.laydemo.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.getUser(user);
    }
}
