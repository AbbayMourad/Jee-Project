package com.project.main.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class updateCompany {
	private static final String UPDATE_ENTREPRISE = "updateCompany";
	@RequestMapping("/updateCompany")
	public String updateCompanyProfile(HttpServletRequest request) {
		return UPDATE_ENTREPRISE;
	}

}
