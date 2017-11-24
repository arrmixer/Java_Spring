package com.AE.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		// call a method on the bean
		System.out.println("Are they the same? " + result(theCoach, alphaCoach));
		System.out.println(theCoach.toString());
		System.out.println(theCoach.toString());
		
		//close the context
		context.close();
		
		
	}
	
	public static boolean result(Coach coach, Coach coach2){
		return coach == coach2;
	}

}
