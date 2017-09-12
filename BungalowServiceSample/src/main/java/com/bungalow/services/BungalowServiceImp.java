package com.bungalow.services;


import com.bungalow.model.Bungalow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sadun on 9/6/17.
 */
@Service
public class BungalowServiceImp implements BungalowService {


    @Autowired
    private com.bungalow.repository.BungalowRepository BungalowRepository;

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
    public List<Bungalow> findBungalow(String name) {

        List<Bungalow> bungalowList = BungalowRepository.findByName(name);

        return bungalowList;
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
