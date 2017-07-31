package com.AE.springdemo.dao;

import com.AE.springdemo.domain.Organization;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Angel on 6/12/17.
 */
public interface OrganizationDao { // in practice should document arguements as
    // well
    // Set the data-source that will be required to create a connection to the
    // database.
    public void setDataSource(DataSource ds);

    // Create a record in the organization table
    public boolean create(Organization org);

    // Retrieve a single organization
    public Organization getOrganization(Integer id);

    // Retrieve all organization from the table
    public List<Organization> getAllOrganizations();

    // Delete a specific organization from the table
    public boolean delete(Organization org);

    // Update an existing organization
    public boolean update(Organization org);

    public void cleanup();
}
