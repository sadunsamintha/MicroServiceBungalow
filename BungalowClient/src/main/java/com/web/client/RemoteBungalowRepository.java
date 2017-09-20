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
		this.serviceUrl =serviceUrl;
	}

	@Override
	public List<Bungalow> getAllBungalows() throws Exception{
		Bungalow[] bungalows;
		try {

			 bungalows = restTemplate.getForObject(serviceUrl+"/bungalows", Bungalow[].class);
			
		} catch (Exception e) {
			throw e;
		}

		return Arrays.asList(bungalows);

	}

	@Override
	public Bungalow getBungalow(String name) {

		 return restTemplate.getForObject(serviceUrl +"/bungalow/{name}",Bungalow.class, name);
	}

}
