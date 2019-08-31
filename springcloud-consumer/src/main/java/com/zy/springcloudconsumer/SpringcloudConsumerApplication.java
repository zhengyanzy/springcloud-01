package com.zy.springcloudconsumer;

import com.zy.myRule.CustomConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@RibbonClient(name = "PROVIDER", configuration = CustomConfiguration.class)
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerApplication.class, args);
    }
}

