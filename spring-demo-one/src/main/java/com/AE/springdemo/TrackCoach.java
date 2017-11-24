package com.AE.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortune;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {

		return "Just do it: " + fortune.getFortune();
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	// add an init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach: inside mehtod doMyStartupStuff");
	}
	// add a destroy method
	public void doMyCleanUpStuffYoYo(){
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
