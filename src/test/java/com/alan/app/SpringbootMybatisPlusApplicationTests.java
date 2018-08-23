package com.alan.app;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alan.app.model.User;
import com.alan.app.service.UserService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisPlusApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {

        // 所有用户
        List<User> users = userService.selectList(null);
        System.out.println(users);

    }

}