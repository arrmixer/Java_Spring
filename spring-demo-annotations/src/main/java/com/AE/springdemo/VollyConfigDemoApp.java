package com.AE.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VollyConfigDemoApp {

	public static void main(String[] args) {
		//create spring container via config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(VolleyConfig.class);
		
		//get bean
		Coach theCoach = context.getBean("volleyBallCoach", Coach.class);
		
		//get methods and fortunes
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.toString());
		
	}

}
