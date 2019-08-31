package com.zy.springcloudconsumer.controller;


import com.zy.springcloudapi.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    private String Url="http://PROVIDER/user/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/get/{id}")
    public User get(@PathVariable(value = "id") Integer id){

        User forObject = restTemplate.getForObject(Url+id, User.class);
        return forObject;
    }
}
