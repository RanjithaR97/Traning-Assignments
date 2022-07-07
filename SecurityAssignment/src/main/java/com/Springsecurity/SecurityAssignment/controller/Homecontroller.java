package com.Springsecurity.SecurityAssignment.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Homecontroller {
	
	@GetMapping("/")
	public String home() {
		return "Hello world";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Hello world User";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Hello world Admin";
	}


}
