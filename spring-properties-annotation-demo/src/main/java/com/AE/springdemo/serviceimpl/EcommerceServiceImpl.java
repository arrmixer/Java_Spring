package com.AE.springdemo.serviceimpl;

import java.util.Random;

import com.AE.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName
				+ " provides an outstanding Ecommerce platform." + 
				"\nThe annual revenue exceeds " + random.nextInt(revenue) +
				" dollars.";
		return service;
	}
	
	public void postConstruct(){
		System.out.println("ecommerceService: postconstruct called...........");
	}
	
	public void preDestroy(){
		System.out.println("ecommerceService: preDestroy called...........");
	}

}
