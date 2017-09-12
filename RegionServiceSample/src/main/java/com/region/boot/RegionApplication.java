package com.region.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.region")
@EnableMongoRepositories("com.region.repository")
public class RegionApplication {

 public static void main(String[] args) throws Exception {
  SpringApplication.run(new Object[] { RegionApplication.class }, args);
 }
}
