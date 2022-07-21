package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feigndemo",url="http://localhost:8084/user")
public interface FeignServiceUtil {
	
	
	@GetMapping("name")
	public String getName();
	
	@GetMapping("method")
	public String getMethod();

}
