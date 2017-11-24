package com.AE.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println("The memory locatin for theCoach: " + theCoach.toString());
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		System.out.println("The memory locatin for alphaCoach: "  + alphaCoach.toString());
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object?" + result);
		System.out.println("The memory locatin for theCoach: " + theCoach.toString());
		
		// close the context
		context.close();
	}

}
