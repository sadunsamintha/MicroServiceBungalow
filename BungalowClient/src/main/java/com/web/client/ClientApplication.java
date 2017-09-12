package com.web.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient

public class ClientApplication {
	

		
//		public static final String ACCOUNTS_SERVICE_URL = "http://Bungalow-Microservice";
	public static final String ACCOUNTS_SERVICE_URL = "http://localhost:2220";
		public static void main(String[] args) {
			SpringApplication.run(ClientApplication.class, args);
		}
		
		@Bean
		public RestTemplate restTemplate() {
			return new RestTemplate();
		}
		@Bean
		public BungalowRepository accountRepository(){
			return new RemoteBungalowRepository(ACCOUNTS_SERVICE_URL);
		}

}
