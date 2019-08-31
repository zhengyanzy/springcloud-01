package com.zy.springcloudprovider8081;

import com.zy.springcloudapi.entites.User;
import com.zy.springcloudprovider8081.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudProvider8081ApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
        User user = userService.get(1);
        System.out.println(user);
    }

}
