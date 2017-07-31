package com.AE.springdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WelcomeService implements GenericWelcomeService {
	
	public List<String> getWelcomeMessage(String name) {
	List<String> myWelcomeMessage = new ArrayList<>();
	
	// Add data to the list
	myWelcomeMessage.add("Hello! ");
	myWelcomeMessage.add(name);
	myWelcomeMessage.add(", welcome to the Spring course :-)");
	
	return myWelcomeMessage;
	
	}
}
