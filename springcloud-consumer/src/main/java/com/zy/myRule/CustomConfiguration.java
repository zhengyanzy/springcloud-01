package com.zy.myRule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Configuration
public class CustomConfiguration {
    @Bean
    public IRule iRule() {
//        return new RandomRule();
        return new MyRule();
    }
}



