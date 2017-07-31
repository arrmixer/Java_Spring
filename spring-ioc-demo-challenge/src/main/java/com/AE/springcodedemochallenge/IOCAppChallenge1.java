package com.AE.springcodedemochallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallenge1 {

	public static void main(String[] args) {
		//creating the app context (container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans-challenge.xml"); 
		
		// create the bean
		City city = (City) ctx.getBean("city");
		
		// invoke the city name via the bean
		city.cityName("Miami");
		
		// close the application context (container)
		((FileSystemXmlApplicationContext) ctx).close();

	}

}
