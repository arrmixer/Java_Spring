package com.AE.springcodedemochallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge2 {

	public static void main(String[] args) {
		// create the application context (container)
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		//create the bean
		City city2 = (City) ctx2.getBean("city");
		
		// invoke the company slogan via the bean
		city2.cityName("New York");
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx2).close();
		

	}

}
