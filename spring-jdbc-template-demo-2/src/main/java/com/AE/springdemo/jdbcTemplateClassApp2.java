package com.AE.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AE.springdemo.dao.OrganizationDao;
import com.AE.springdemo.domain.Organization;

public class jdbcTemplateClassApp2 {

	public static void main(String[] args) {
		
		// creating the app context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//Create the bean
		OrganizationDao dao = (OrganizationDao) ctx.getBean("orgDao");
		
		//Creating seed data.
//		DaoUtils.createSeedData(dao);
		
		//List organizations 
		List<Organization> orgs = dao.getAllOrganizations();
		DaoUtils.printOrganizations(orgs, DaoUtils.readOperation);
//		
//		// Create a new organization record
//		Organization org = new Organization("General Electric", 1978, "98989", 5776, "Imagination at work");
//		boolean isCreated = dao.create(org);
//		DaoUtils.printSuccessFailure(DaoUtils.createOperation, isCreated);
//		DaoUtils.printOrganizationCount(dao.getAllOrganizations(), DaoUtils.createOperation);
//		DaoUtils.printOrganizations(dao.getAllOrganizations(), DaoUtils.readOperation);
//		
//		// get a single organization
//		Organization org2 = dao.getOrganization(1);
//		DaoUtils.printOrganization(org2, "getOrganization");
//		
//		//Updating a slogan for an organization
//		Organization org3 = dao.getOrganization(2);
//		org3.setSlogan("We build ** awesome ** driving machine!");
//		boolean isUpdated = dao.update(org3);
//		DaoUtils.printSuccessFailure(DaoUtils.updateOperation, isUpdated);
//		DaoUtils.printOrganization(dao.getOrganization(2), DaoUtils.updateOperation);
		
//		Deleting an entry
		boolean isDeleted = dao.delete(dao.getOrganization(3));
		DaoUtils.printSuccessFailure(DaoUtils.deleteOperation, isDeleted);
		DaoUtils.printOrganizations(dao.getAllOrganizations(), DaoUtils.deleteOperation);
		
		
		
//		cleanup
		dao.cleanup();
		DaoUtils.printOrganizationCount(dao.getAllOrganizations(), DaoUtils.cleanupOperation);
		//close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
