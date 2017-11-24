package com.AE.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class VolleyConfig {

	@Bean
	public FortuneService volleyService( ){
		return new VolleyFortune();
	}
	
	@Bean
	public Coach volleyBallCoach(){
		VolleyBallCoach myVolleyCoach = new VolleyBallCoach(volleyService());
		return myVolleyCoach;
	}
}
