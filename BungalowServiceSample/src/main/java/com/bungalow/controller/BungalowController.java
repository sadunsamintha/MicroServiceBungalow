package com.bungalow.controller;



import com.bungalow.model.Bungalow;
import com.bungalow.services.BungalowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BungalowController {


  @Autowired
  private BungalowService bungalowService;


  @RequestMapping(value = "/add-bungalow", method = RequestMethod.POST)
  public String createBungalow(@RequestBody Bungalow bungalow){
   bungalowService.addBungalow(bungalow);
    return "Bungalow created successfully";
  }

  @RequestMapping(method = RequestMethod.GET, value= "/bungalow/{name}")
  public List<Bungalow> getBungalow(@PathVariable("name") String name){

      return bungalowService.findBungalow(name);
  }

  @RequestMapping("/bungalows")
  public List<Bungalow> getAllBungalows() {
      return bungalowService.getAllBungalows();
  }


  @RequestMapping(value="/update-bungalow", method=RequestMethod.POST)
  public String updateRegion(@RequestBody Bungalow bungalow){
     bungalowService.updateBungalow(bungalow);
    return "successfully updated bungalow";
  }

  @RequestMapping(value="/delete-bungalow", method=RequestMethod.POST)
  public String deleteRegion(@RequestBody Bungalow bungalow){
	bungalowService.deleteBungalow(bungalow);
    return "SuccessFully deleted bungalow";
  }

   @RequestMapping(value="/delete-bungalowByName/{name}", method=RequestMethod.GET)
     public List<Bungalow> deleteBungalow(@PathVariable("name") String name){
       return bungalowService.removeByName(name);
    }


}