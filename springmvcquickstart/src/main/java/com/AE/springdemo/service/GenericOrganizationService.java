package com.AE.springdemo.service;

import com.AE.springdemo.domain.Organization;

import java.util.List;

/**
 * Created by Angel on 6/12/17.
 * always use interfaces with services
 */

public interface GenericOrganizationService {
    public List<Organization> getOrgList();
}
