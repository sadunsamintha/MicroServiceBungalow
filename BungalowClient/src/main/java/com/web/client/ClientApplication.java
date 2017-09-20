package com.web.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableDiscoveryClient

public class ClientApplication {
	

		

	public static final String BUNGALOW_SERVICE_URL = "http://localhost:8081";
//		public static final String BUNGALOW_SERVICE_URL = "http://bungalow-microservice";
		public static void main(String[] args) {
			SpringApplication.run(ClientApplication.class, args);
		}
		
		@Bean
		public RestTemplate restTemplate() {
			return new RestTemplate();
		}
		
	
		@Bean
		public BungalowRepository accountRepository(){
			return new RemoteBungalowRepository(BUNGALOW_SERVICE_URL);
		}

}
