package com.AE.service.demo;

import java.util.List;
import java.util.ArrayList;

public class WelcomeService {
	
	public List<String> getWelcomeMessage(String name) {
	List<String> myWelcomeMessage = new ArrayList<>();
	
	// Add data to the list
	myWelcomeMessage.add("Hello! ");
	myWelcomeMessage.add(name);
	myWelcomeMessage.add(", welcome to the Spring course :-)");
	
	return myWelcomeMessage;
	
	}
}
