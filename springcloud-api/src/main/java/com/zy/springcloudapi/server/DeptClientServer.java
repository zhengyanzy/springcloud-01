package com.zy.springcloudapi.server;


import com.zy.springcloudapi.entites.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(value = "PROVIDER")
public interface DeptClientServer {
    @GetMapping("/user/get/{id}")
    public User get(@PathVariable(value = "id") Integer id);
}
