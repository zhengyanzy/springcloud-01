package com.zy.springcloudprovider8081;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.context.annotation.Bean;

//开启注解
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class SpringcloudProvider8081Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProvider8081Application.class, args);
    }
}
