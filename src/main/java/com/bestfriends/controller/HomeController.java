package com.bestfriends.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
	
	@RequestMapping("/homePage")
	public String displayHomePage() {
		return "homePage";
	}

}
