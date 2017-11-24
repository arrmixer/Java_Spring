package com.AE.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read sprng config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach coach = context.getBean("tennisCoach",Coach.class);
		Coach coach2 = context.getBean("footballCoach", FootballCoach.class);
		// call a method on the bean
		System.out.println(coach.getDailyWorkout());
		// using constructor autowire
		System.out.println(coach.getDailyFortune());
	
		System.out.println(coach2.getDailyWorkout());
		// using setter autowire
		System.out.println(coach2.getDailyFortune());
		//close the context
		context.close();
	}

}
