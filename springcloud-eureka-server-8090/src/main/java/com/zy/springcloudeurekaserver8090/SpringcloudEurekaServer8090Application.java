package com.zy.springcloudeurekaserver8090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;




@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServer8090Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer8090Application.class, args);
    }

}
