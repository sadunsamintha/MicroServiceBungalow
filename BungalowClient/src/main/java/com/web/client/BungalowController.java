/**
 * 
 */
package com.web.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@RequestMapping("/bungalowList")
	public String accountList(Model model) {
		model.addAttribute("bungalows", bungalowRepository.getAllBungalows());
		return "bungalowList";
	}
	
//	@RequestMapping("/accountDetails")
//	public String accountDetails(@RequestParam("number") String id, Model model) {
//		model.addAttribute("account", accountRepository.getAccount(id));
//		return "accountDetails";
//	}
}
