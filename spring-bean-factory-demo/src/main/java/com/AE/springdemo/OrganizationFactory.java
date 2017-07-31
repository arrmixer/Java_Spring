package com.AE.springdemo;

public class OrganizationFactory {
 public Organization getInstance(String companyName, int yearOfIncorporation){
	 System.out.println("Invoking Instance factory method........");
	 return new Organization(companyName, yearOfIncorporation);
 }
}
