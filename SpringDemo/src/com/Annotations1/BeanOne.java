package com.Annotations1;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {
	private BeanTwo beanTwo;
	
	//@Resource
	public void setBeanTwo(BeanTwo beanTwo) {
		this.beanTwo=beanTwo;
	}
	
	public void doSomething() {
		System.out.println("BeanOne method");
	}

}
