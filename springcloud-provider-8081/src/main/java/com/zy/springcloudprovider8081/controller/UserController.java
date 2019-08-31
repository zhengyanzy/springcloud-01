package com.zy.springcloudprovider8081.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zy.springcloudapi.entites.User;
import com.zy.springcloudapi.server.DeptClientServer;
import com.zy.springcloudprovider8081.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @HystrixCommand(fallbackMethod = "defaultStores")
    @GetMapping("/user/{id}")
    public User get(@PathVariable(value = "id",required = true) Integer id){
        User user = userService.get(id);
//        int a = 1/0;                      //伪造错误
        return user;
    }

    public User defaultStores(Integer id){ //参数需要相同
        User user = new User();
        user.setName("错误了");
        return user;
    }
}
