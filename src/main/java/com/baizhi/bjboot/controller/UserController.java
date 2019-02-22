package com.baizhi.bjboot.controller;

import com.baizhi.bjboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public Map test() {
        return userService.getAllUsers();
    }
}
