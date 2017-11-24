package com.AE.springdemo;

public class HappyFortuneService implements FortuneService {
	String[] Service  = {"Today is your lucky day", "You will have a hard Day", "Just get to work!"};
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int random = randomWithRange(0, Service.length - 1);
		return Service[random];
	}
	
	int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}

}
