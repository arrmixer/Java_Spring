package com.AE.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	@Bean
	public Coach swimCoach(){
		SwimCoach mySwimCoach = new SwimCoach( sadFortuneService() );
		
		return mySwimCoach;
	}
	
	

	
	
	
}
