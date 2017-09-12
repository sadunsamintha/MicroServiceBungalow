package com.web.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @author Dinesh.Rajput
 *
 */
public class RemoteBungalowRepository implements BungalowRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteBungalowRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	@Override
	public List<Bungalow> getAllBungalows() {
		Bungalow[] bungalows = restTemplate.getForObject(serviceUrl+"/bungalows", Bungalow[].class);
		return Arrays.asList(bungalows);
	}

//	@Override
//	public Account getAccount(String number) {
//		return restTemplate.getForObject(serviceUrl + "/accounts/{id}",
//				Account.class, number);
//	}

}
