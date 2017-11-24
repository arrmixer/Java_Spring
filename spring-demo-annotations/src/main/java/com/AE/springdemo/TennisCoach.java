package com.AE.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.net.SyslogOutputStream;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("fileFortune")
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(){
		System.out.println("Spring inside TennisCoach constructor");
		hello();
		
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartUpStuff(){
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff(){
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do some Backhands";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

	

}
