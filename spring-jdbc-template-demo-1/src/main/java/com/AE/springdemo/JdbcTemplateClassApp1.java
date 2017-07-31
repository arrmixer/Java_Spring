package com.AE.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AE.springdemo.dao.OrganizationDao;
import com.AE.springdemo.domain.Organization;

public class JdbcTemplateClassApp1 {

	public static void main(String[] args) {
		
		// creating the app context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//Create the bean
		OrganizationDao dao = (OrganizationDao) ctx.getBean("orgDao");
		List<Organization> orgs = dao.getAllOrganizations();
		for (Organization org : orgs){
			System.out.println(org);
		}
		
		//close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
