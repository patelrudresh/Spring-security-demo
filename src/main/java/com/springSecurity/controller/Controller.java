package com.springSecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

 class Controller {
 
	@GetMapping("/home")
	@PreAuthorize("hasRole('user')")
	public String Home() {
		return "welcome to home page ";
	}
	
	@GetMapping("/about")
	@PreAuthorize("hasRole('admin')")
	public String Admin() {
		return "welcome to About page";
	}
}
