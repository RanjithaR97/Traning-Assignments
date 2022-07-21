package com.BeanInitDestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ApplicationAware.Applicationcontext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		context.registerShutdownHook();
		
		Restaraunt obj=(Restaraunt) context.getBean("restaurant");
		obj.greetCustomer();
		
		Shape obj1=(Shape) context.getBean("shape");
		obj1.draw();
		
		Hello hello=(Hello) context.getBean("hello");
		hello.hello();
				
		Applicationcontext obj3=context.getBean(Applicationcontext.class);
		obj3.run();

	}

}
