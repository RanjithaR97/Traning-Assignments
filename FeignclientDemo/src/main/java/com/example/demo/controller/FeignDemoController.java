package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FeignServiceUtil;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {
	
	@Autowired
	private FeignServiceUtil feignServiceUtil;
	@GetMapping("/username")
	public String getUserName() {
		return feignServiceUtil.getName();
	}
	@GetMapping("/usermethod")
	public String getMethod() {
		return feignServiceUtil.getMethod();
	}

}
