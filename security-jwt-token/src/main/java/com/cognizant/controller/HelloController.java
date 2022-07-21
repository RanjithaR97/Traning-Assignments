package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String hi() {
		return "Welcome to Spring Security...";
	}
	
	@GetMapping("/user")
	public String hiUser() {
		return "Welcome USER ....";
	}
	
	@GetMapping("/admin")
	public String hiAdmin() {
		return "Welcome Admin ....";
	}
}
