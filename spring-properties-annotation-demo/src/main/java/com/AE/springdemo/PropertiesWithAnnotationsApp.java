package com.AE.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.AE.springdemo.domain.Organization;



public class PropertiesWithAnnotationsApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
		Organization org = (Organization) ctx.getBean("myorg");
		System.out.println(org);
		System.out.println("slogan: " + org.corporateSlogan());
		((AnnotationConfigApplicationContext) ctx).close();
	}

}
