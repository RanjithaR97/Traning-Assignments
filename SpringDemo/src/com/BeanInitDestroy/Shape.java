package com.BeanInitDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Shape implements InitializingBean,DisposableBean {
	@Override
	public void afterPropertiesSet() throws Exception {
	System.out.println("Bean is getting initiazed");
		
	}
	public void draw() {
		System.out.println("Drawing a shape for given objects");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean is destroying");
		
	}

	
	

}
