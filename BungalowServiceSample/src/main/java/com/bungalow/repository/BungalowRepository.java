package com.bungalow.repository;


import com.bungalow.model.Bungalow;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BungalowRepository extends MongoRepository<Bungalow, String>{

    Bungalow findByName(String name);
    List<Bungalow> removeByName(String name);
}
