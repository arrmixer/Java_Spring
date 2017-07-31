package com.AE.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AE.springdemo.domain.Organization;

public class BeanScopeApp {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		Organization org2 = (Organization) ctx.getBean("myorg");
		org2.setPostalCode("33186");

		// invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());

		// Print organization details
		System.out.println(org);
		System.out.println(org2);
		if (org == org2) {
			System.out.println("Singleton scope test: org and org2 point to the same instance");

		 }else{
			 System.out.println("org and org2 are different instances.");
		 }

		System.out.println(org.corporateService());

		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
