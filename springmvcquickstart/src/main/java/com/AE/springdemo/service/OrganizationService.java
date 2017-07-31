package com.AE.springdemo.service;

import com.AE.springdemo.dao.OrganizationDao;
import com.AE.springdemo.domain.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Angel on 6/12/17.
 */

@Service
public class OrganizationService implements GenericOrganizationService {

    @Autowired
    private OrganizationDao organizationDao;

    public List<Organization> getOrgList(){
        List<Organization> orgList = organizationDao.getAllOrganizations();
        return orgList;
    }

}