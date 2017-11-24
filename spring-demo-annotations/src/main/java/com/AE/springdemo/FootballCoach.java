package com.AE.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	public FootballCoach(){
		System.out.println("Spring inside FootballCoach constructor");
		hello();
	}
	
//setter injection 
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}


	


	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "work on your fundamentals!";
	}


	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
