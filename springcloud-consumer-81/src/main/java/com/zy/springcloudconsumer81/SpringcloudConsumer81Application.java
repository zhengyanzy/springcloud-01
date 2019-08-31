package com.zy.springcloudconsumer81;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.zy.springcloudapi.server"})

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudConsumer81Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumer81Application.class, args);
    }
}
