package com.zy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class SpringcloudHystrixdashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudHystrixdashboardApplication.class, args);
    }
}
