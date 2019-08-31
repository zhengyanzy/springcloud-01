package com.zy.springcloudconsumer81.controller;


import com.zy.springcloudapi.entites.User;
import com.zy.springcloudapi.server.DeptClientServer;
import com.zy.springcloudconsumer81.server.FeiginServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private FeiginServer feiginServer;

    //为测试成功
    /*@Autowired
    private DeptClientServer deptClientServer;*/

    @GetMapping("/user/get/{id}")
    public User get(@PathVariable(value = "id") Integer id){
        //User user = deptClientServer.get(id);
        User user1 = feiginServer.get(id);
        return user1;
    }

    @GetMapping("test")
    public String test(){
        return "ok";
    }
}
