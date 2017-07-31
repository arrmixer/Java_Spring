/**
 * 
 */
package com.AE.springdemo.service;

import java.util.List;

import com.AE.springdemo.domain.Organization;

/**
 * @author Angel
 * always use interfaces with services 
 *
 */
public interface GenericOrganizationService {
	public List<Organization> getOrgList();
}
