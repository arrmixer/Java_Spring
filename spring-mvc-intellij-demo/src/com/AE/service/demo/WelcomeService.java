package com.AE.service.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 6/12/17.
 */
public class WelcomeService implements GenericWelcomeService{

    @Override
    public List<String> getWelcomeMessage(String name) {
        List<String> myWelcomeMessage = new ArrayList<>();

        // Add data to the list
        myWelcomeMessage.add("Hello");
        myWelcomeMessage.add(name);
        myWelcomeMessage.add(", welcome to the spring course.");

        return myWelcomeMessage;
    }

    

}
