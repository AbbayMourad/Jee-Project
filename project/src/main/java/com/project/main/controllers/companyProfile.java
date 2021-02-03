package com.project.main.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class companyProfile {
	private static final String PROFILE_ENTREPRISE = "companyProfile";
	
	
	@RequestMapping("/companyProfile")
	public String CompanyProfile(HttpServletRequest request) {
		return PROFILE_ENTREPRISE;
	}
	

}
