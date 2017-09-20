package com.bungalow.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.bungalow")
@EnableMongoRepositories("com.bungalow.repository")
public class BungalowApplication {

 public static void main(String[] args) throws Exception {
  SpringApplication.run(new Object[] { BungalowApplication.class }, args);
 }
 
 @Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}

@RefreshScope
@RestController
class MessageRestController {

    @Value("${message:Hello default}")
    private String message;
    

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
    
    
}