package com.AE.springdemo.domain;

import com.AE.springdemo.service.RecruitmentService;

public class HumanResourceDepartment implements Department {
	private String deptName;
	private RecruitmentService recruitmentService;
	private Organization organization;

	public HumanResourceDepartment(RecruitmentService recruitmentService, Organization organization) {
		this.recruitmentService = recruitmentService;
		this.organization = organization;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(organization.getCompanyName(), deptName,
				numberOfRecruitments);

		return hiringFacts;
	}

}
