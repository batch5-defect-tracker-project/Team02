package com.defect.tracker.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * contains custom error messages
 *
 */

@Component
@PropertySource("classpath:ValidationMessages.properties")
public class ValidationFailureStatusCodes {
	
	@Value("${validation.project.AlreadyExists}")
	private String projectNameAlreadyExists;
	
	@Value("${validation.project.existsById}")
	private String existsById;
	@Value("${validation.project.projectById}")
	private String projectById;

	public String getProjectNameAlreadyExists() {
		return projectNameAlreadyExists;
	}

	public void setProjectNameAlreadyExists(String projectNameAlreadyExists) {
		this.projectNameAlreadyExists = projectNameAlreadyExists;
	}

	public String getExistsById() {
		return existsById;
	}

	public void setExistsById(String existsById) {
		this.existsById = existsById;
	}

	public String getProjectById() {
		return projectById;
	}

	public void setProjectById(String projectById) {
		this.projectById = projectById;
	}


	
}
