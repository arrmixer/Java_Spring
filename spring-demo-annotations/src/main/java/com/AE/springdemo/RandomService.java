package com.AE.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	String[] randomString = new String[]{"Good luck", "Break a leg", "Do your best"};
	
	//method one to use Random
	private int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	//another way to use Random
	private Random myRandom = new Random();
	private int index = myRandom.nextInt(randomString.length);
	
	@Override
	public String getFortune() {
		
		int number = randomWithRange(0,2);
		//return randomString[number];
		return randomString[index];
	}

}
