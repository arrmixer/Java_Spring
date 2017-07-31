package com.AE.springdemo.controller;

import com.AE.service.demo.GenericWelcomeService;
import com.AE.service.demo.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Angel on 6/12/17.
 */

@Controller
public class WelcomeController {

    @Autowired
    private GenericWelcomeService welcomeService;

    @RequestMapping
    public String doWelcome(Model model){
        // 1. retrieve process data

        WelcomeService welcomeService  = new WelcomeService();
        List<String> welcomeMessages = welcomeService.getWelcomeMessage("Angel");

        // 2. Add data to the model
        model.addAttribute("myWelcomeMessage", welcomeMessages);

        // 3. Return logical view name
        return "welcomeNew";
    }
}
