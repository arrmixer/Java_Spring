package com.AE.springdemo;

public class BaseballCoach implements Coach {

	//create Dependancy injection object.. private field
	private HappyFortuneService fortune;
	
	//defince constructor for the dependency injection
	public BaseballCoach(HappyFortuneService fortune){
		this.fortune = fortune;
		
	}
	
	public String getDailyWorkout() {
		return "Spending 30 minutes on hitting";
	}

	@Override
	public String getDailyFortune() {
		//use the dependency to help give fortune
		return fortune.getFortune();
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
}
