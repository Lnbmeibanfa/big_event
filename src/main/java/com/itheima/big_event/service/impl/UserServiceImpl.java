package com.itheima.big_event.service.impl;


import com.itheima.big_event.mapper.RegisterMapper;
import com.itheima.big_event.pojo.User;
import com.itheima.big_event.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterMapper registerMapper;

    @Override
    public void insertUser(User user) {
        LocalDateTime createTime = LocalDateTime.now();
        LocalDateTime updateTime = LocalDateTime.now();
        user.setCreateTime(createTime);
        user.setUpdateTime(updateTime);
        registerMapper.insertUser(user);
    }
}
