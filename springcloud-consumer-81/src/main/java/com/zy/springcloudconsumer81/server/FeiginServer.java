package com.zy.springcloudconsumer81.server;

import com.zy.springcloudapi.entites.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//如果任何一个访问出了问题,去执行UserclientServiceFa1lbackFactory相对应的方法;
@FeignClient(value = "PROVIDER",fallbackFactory = UserclientServiceFa1lbackFactory.class)
public interface FeiginServer {
    @GetMapping("/user/{id}")
    public User get(@PathVariable(value = "id") Integer id);
}
