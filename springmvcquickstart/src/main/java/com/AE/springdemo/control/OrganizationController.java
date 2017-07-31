package com.AE.springdemo.control;

import com.AE.springdemo.domain.Organization;
import com.AE.springdemo.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Angel on 6/12/17.
 */
@Controller
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping
    public String listOrganizationUsingSQLTag(){
        return "listOrganization1";
    }

    @RequestMapping("/service")
    public String listOrganizationUsingService(Model model){
        List<Organization> orgs = organizationService.getOrgList();
        model.addAttribute("orgList", orgs);
        return "listOrganization2";
    }
}
