package com.hotel.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sadun on 9/1/17.
 */

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
    public static void main(String[] args){
        SpringApplication.run(DiscoveryApplication.class,args);

    }
}
