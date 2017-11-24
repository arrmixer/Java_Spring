package com.AE.springdemo;

public interface Coach {

	public String  getDailyWorkout();
	public String  getDailyFortune();
	public default void hello(){
		System.out.println("inside coach interface");
	}
}
