package com.AE.springdemo.daoimpl;

import com.AE.springdemo.domain.Organization;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Angel on 6/12/17.
 */

public class OrganizationRowMapper implements RowMapper<Organization> {

    public Organization mapRow(ResultSet rs, int rownum) throws SQLException {
        Organization org = new Organization();
        org.setId(rs.getInt("id"));
        org.setCompanyName(rs.getString("company_name"));
        org.setYearOfIncorporation(rs.getInt("year_of_incorporation"));
        org.setEmployeeCount(rs.getInt("employee_count"));
        org.setPostalCode(rs.getString("postal_code"));
        org.setSlogan(rs.getString("slogan"));

        return org;

    }

}
