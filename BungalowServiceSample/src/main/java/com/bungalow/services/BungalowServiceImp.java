package com.bungalow.services;


import com.bungalow.model.Bungalow;
import com.bungalow.model.Region;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;



/**
 * Created by sadun on 9/6/17.
 */
@Service
public class BungalowServiceImp implements BungalowService {


    @Autowired
    private com.bungalow.repository.BungalowRepository BungalowRepository;
    
    @Autowired
	protected RestTemplate restTemplate;

    @Override
    public void addBungalow(Bungalow bungalow){

          BungalowRepository.insert(bungalow);

    }

   /* @Override
    public List<Bungalow> findBungalow(String bungalowName) {

        List<Bungalow> bungalowList = BungalowRepository.findByname(bungalowName);

        return bungalowList;
    }*/

    @Override
    public Bungalow findBungalow(String name) {

        Bungalow bungalow = BungalowRepository.findByName(name);
        
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept",MediaType.APPLICATION_JSON_UTF8_VALUE);
		HttpEntity<?> entity = new HttpEntity<>(headers);


		ResponseEntity<Region> result = restTemplate.exchange("http://Region-Microservice"+"/region/"+bungalow.getRegionId(), HttpMethod.GET, entity,Region.class);
		Region region = result.getBody();
		
		bungalow.setRegionName(region.getName());

        return bungalow;
    }

    @Override
    public String deleteBungalow(Bungalow bungalow) {

        BungalowRepository.delete(bungalow);
        return "Successfully delted bungalow";
    }

    @Override
    public List<Bungalow> removeByName(String name) {
        return BungalowRepository.removeByName(name);

    }


    @Override
    public List<Bungalow> getAllBungalows() {

        return BungalowRepository.findAll();
    }

    @Override
    public Bungalow updateBungalow(Bungalow bungalow) {

        return BungalowRepository.save(bungalow);
    }






}
