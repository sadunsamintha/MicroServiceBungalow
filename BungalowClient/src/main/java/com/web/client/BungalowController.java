/**
 * 
 */
package com.web.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class BungalowController {
	
	@Autowired
	BungalowRepository bungalowRepository;
	
	
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
//	@RequestMapping("/bungalowList")
	@RequestMapping(value = "/bungalowList",method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public String accountList(Model model) {
		try {
			model.addAttribute("bungalows", bungalowRepository.getAllBungalows());
			return "bungalowList";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	@RequestMapping("/bungalowDetails")
	public String bungalowDetails(@RequestParam("name") String name, Model model) {
		model.addAttribute("bungalow", bungalowRepository.getBungalow(name));
		
		
	
		return "bungalowDetails";
	}
	
	
//	@RequestMapping(value = "/bungalow",method = RequestMethod.POST, produces = "application/json; charset=utf-8")
//	public String addBungalow(@RequestParam("name") String name, Model model) {
//		model.addBunglow("bungalow", bungalowRepository.getBungalow(name));
//		return name;
//	}
//	
//	@RequestMapping(value = "/bungalow",method = RequestMethod.GET, produces = "application/json; charset=utf-8")
//	public String getBungalow(@RequestParam("name") String name, Model model) {
//		model.addAttribute("bungalow", bungalowRepository.getBungalow(name));
//			return "bungalowDetails";
//	}
}
