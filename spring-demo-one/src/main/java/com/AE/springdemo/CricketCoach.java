package com.AE.springdemo;

public class CricketCoach implements Coach {
	// make dependency
	private FortuneService fortune;
	private String emailAddress;
	private String team;

	// create a no-arg constructor for Spring
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	// create Setter method for bean
	public void setFortune(FortuneService fortune) {
		System.out.println("CricketCoach: inside setter method");
		this.fortune = fortune;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "My email is: " + emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
	

}
