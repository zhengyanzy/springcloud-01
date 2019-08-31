package com.zy.springcloudconsumer81.server;

import com.zy.springcloudapi.entites.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;


@Component
public class UserclientServiceFa1lbackFactory implements FallbackFactory<FeiginServer> {
    @Override
    public FeiginServer create(Throwable throwable) {
        return new FeiginServer(){
            @Override
            public User get(Integer id) {
                User user = new User();
                user.setId(id);
                user.setName("该服务已经停止.....请稍后访问");
                return user;
            }
        };
    }
}
