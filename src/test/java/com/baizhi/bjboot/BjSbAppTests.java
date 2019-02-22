package com.baizhi.bjboot;

import com.baizhi.bjboot.dao.UserDao;
import com.baizhi.bjboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BjSbAppTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        List list = userDao.selectList(null);
        System.out.println(list);
    }

    @Test
    public void contextLoads1() {
        Map users = userService.getAllUsers();
        System.out.println(users.get("users"));
    }

    @Test
    public void contextLoads2() {
        double a = 1 + 2 * 3 % 4 / 5;
        System.out.println(a);
    }

}
