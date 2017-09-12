package com.bungalow.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.bungalow")
@EnableMongoRepositories("com.bungalow.repository")
public class BungalowApplication {

 public static void main(String[] args) throws Exception {
  SpringApplication.run(new Object[] { BungalowApplication.class }, args);
 }
}
