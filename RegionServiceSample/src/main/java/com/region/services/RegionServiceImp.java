package com.region.services;

import com.region.model.Region;
import com.region.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sadun on 9/6/17.
 */
@Service
public class RegionServiceImp implements RegionService{


    @Autowired
    private RegionRepository regionRepository;

    @Override
    public void addRegion(Region region){

        regionRepository.insert(region);
//        regionRepository.save(region);
    }

    @Override
    public Region findRegion(String regionID) {
        return  regionRepository.findOne(regionID);
    }

    @Override
    public void deleteRegion(Region region) {
        regionRepository.delete(region);
    }

    @Override
    public List<Region> findRegionByName(String name) {
        return regionRepository.findByName(name);
    }


    @Override
    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    @Override
    public Region updateRegion(Region region) {
         return regionRepository.save(region);
    }




      /*  public List<Region> getAllRegions(){
            List<Region>regionRecords = new ArrayList<>();
            regionRepository.findAll().forEach(regionRecords::add);
            return regionRecords;
        }*/

      /*  public UserRecord getUser(String id){
            return userRepository.findOne(id);
        }



        public void updateUser(UserRecord userRecord) {
            userRepository.save(userRecord);
        }

        public void deleteUser(UserRecord userRecord) {
            userRepository.delete(userRecord);
        }
        public void deleteUser(String id) {
            userRepository.delete(id);
        }
*/

}
