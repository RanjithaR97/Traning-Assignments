package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {
	
	@GetMapping("/name")
	public String getName() {
		return "Hii ";
	}
	@GetMapping("/method")
	public String getmethod() {
		return "welcome ";
	}

}
