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

	private String proNameAlreadyExists;
	
	@Value("${validation.module.AlreadyExists}")
	private String moduleNameAlreadyExists;
	
	@Value("${validation.module.existsById}")
	private String existsById;

	
	public String getExistsById() {
		return existsById;
	}

	public void setExistsById(String existsById) {
		this.existsById = existsById;

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


	

	public String getModuleNameAlreadyExists() {
		return moduleNameAlreadyExists;
	}

	public void setModuleNameAlreadyExists(String moduleNameAlreadyExists) {
		this.moduleNameAlreadyExists = moduleNameAlreadyExists;
	}

	


}
