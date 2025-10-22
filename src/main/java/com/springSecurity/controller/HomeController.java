package com.springSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import oracle.jdbc.proxy.annotation.GetCreator;

@RestController
public class HomeController {
   
	@GetMapping("/")
	public String Index() {
		return "index";
	}
	@GetMapping("/about")
	public String About() {
		return "about";
	}
	@GetMapping("/profile")
	public String Profile() {
		return "profile";
	}
	
}
