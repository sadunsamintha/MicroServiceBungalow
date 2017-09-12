package com.region.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.region.model.Region;
import com.region.services.RegionService;
import java.util.List;


@RestController
public class RegionController {



  @Autowired
  private RegionService regionService;

  @RequestMapping(value = "/add-region", method = RequestMethod.POST)
  public String createRegion(@RequestBody Region region){
    regionService.addRegion(region);
 
    return "Region created successfully";
   
    
  }



  @RequestMapping(method = RequestMethod.GET, value="/region/{id}")
  public Region getRegion(@PathVariable("id") String regionID){
    return regionService.findRegion(regionID);
  }

  @RequestMapping(method = RequestMethod.GET, value="/regionname/{name}")
  public List<Region> getRegionByName(@PathVariable("name") String name){
    return regionService.findRegionByName(name);
  }


  @RequestMapping("/regions")
  public List<Region> getAllRegions(){
	return regionService.getAllRegions();
  }

  @RequestMapping(value="/update-region", method=RequestMethod.POST)
  public String updateRegion(@RequestBody Region region){
     regionService.updateRegion(region);
    return "successfully updated region";
  }

  @RequestMapping(value="/delete-region", method=RequestMethod.POST)
  public String deleteRegion(@RequestBody Region region){
	regionService.deleteRegion(region);
    return "SuccessFully deleted region";
  }

  /* @RequestMapping(value="/delete-user", method=RequestMethod.POST)
    public void deleteUser(@RequestBody String id){
     regionService.deleteUser(id);
    }*/

}