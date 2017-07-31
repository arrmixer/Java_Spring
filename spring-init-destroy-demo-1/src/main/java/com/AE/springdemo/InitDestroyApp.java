package com.AE.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AE.springdemo.domain.Organization;


public class InitDestroyApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create the bean
//		Organization org = (Organization) ctx.getBean("myorg");
//		
//		// invoke the company slogan via the bean
//		System.out.println(org.corporateSlogan());
//		
//		// Print organization details
//		System.out.println(org);
//		
//		System.out.println(org.corporateService());
		
		//close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
