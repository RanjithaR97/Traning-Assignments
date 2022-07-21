package com.BeanInitDestroy;

public class Hello {
	
	@PostConstruct
	public void init() {
		System.out.println(" init");
	}
	public void hello() {
		System.out.println("Welcome");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
	

}
