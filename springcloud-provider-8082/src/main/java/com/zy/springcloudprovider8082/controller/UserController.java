package com.zy.springcloudprovider8082.controller;


import com.zy.springcloudapi.entites.User;
import com.zy.springcloudprovider8082.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User get(@PathVariable(value = "id",required = true) Integer id){
        User user = userService.get(id);
        return user;
    }
}
