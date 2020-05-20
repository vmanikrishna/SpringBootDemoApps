package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileAPIs {
	
	@RequestMapping(path = "/getWishMessage",method = RequestMethod.GET)
	public String getWishMessage(String name) {
		
		return "Hi, Welcome to ClientTwo Application"+name;
	}

}
