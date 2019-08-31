package com.zy.springcloudeurekaserver8091;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServer8091Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer8091Application.class, args);
    }

}
