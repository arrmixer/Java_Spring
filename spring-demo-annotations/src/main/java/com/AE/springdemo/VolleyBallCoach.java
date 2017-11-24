package com.AE.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class VolleyBallCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${volley.team}")
	private String team;
	
	@Value("${volley.email}")
	private String email;
	public VolleyBallCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "work on your serves!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
	
	


	public String getTeam(){
		return team;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return "VolleyBallCoach [team=" + team + ", email=" + email + "]";
	}
	
	

}
