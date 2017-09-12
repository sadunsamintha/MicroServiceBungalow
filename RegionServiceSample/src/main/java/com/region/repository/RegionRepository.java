package com.region.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.region.model.Region;

import java.util.List;

public interface RegionRepository extends MongoRepository<Region, String>{
    List<Region> findByName(String name);
}
