package com.bestfriends.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bestfriends.model.Registration;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String displayHomePage(HttpServletRequest request) {
		return "homePage";
	}

	@RequestMapping(path="/createAccount", method=RequestMethod.GET)
	public String displayCreateAccountPage(ModelMap map) {
		if(!map.containsAttribute("registration")) {
			map.addAttribute("registration", new Registration());
		}
		return "createAccount";
	}
	
	@RequestMapping(path="/createAccount", method=RequestMethod.POST)
	public String addNewAccount(@Valid @ModelAttribute("registration") Registration newRegistration, BindingResult result) {

		if(result.hasErrors()) {
			return "createAccount";
		}
		return "redirect:/success";
	}
	
	@RequestMapping(path="/success", method=RequestMethod.GET)
	public String showNewAccountConfirmation(ModelMap map) {
		return "success";
	}

	
}
