package com.baizhi.bjboot.service.impl;

import com.baizhi.bjboot.dao.UserDao;
import com.baizhi.bjboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Map getAllUsers() {
        HashMap map = new HashMap();
        map.put("users", userDao.selectList(null));
        return map;
    }
}
