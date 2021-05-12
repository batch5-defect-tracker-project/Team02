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
	
	@Value("${validation.employee.AlreadyExists}")
	private String employeeEmailAlreadyExists;
	
	@Value("${validation.gender.AlreadyExists}")
	private String genderNameAlreadyExists;

	@Value("${validation.employee.ExistsId}")
	private String existsById;
	
	public String getProjectNameAlreadyExists() {
		return projectNameAlreadyExists;
	}

	public void setProjectNameAlreadyExists(String projectNameAlreadyExists) {
		this.projectNameAlreadyExists = projectNameAlreadyExists;
	}

	public String getEmployeeEmailAlreadyExists() {
		return employeeEmailAlreadyExists;
	}

	public void setEmployeeEmailAlreadyExists(String employeeEmailAlreadyExists) {
		this.employeeEmailAlreadyExists = employeeEmailAlreadyExists;
	}

	public String getGenderNameAlreadyExists() {
		return genderNameAlreadyExists;
	}

	public void setGenderNameAlreadyExists(String genderNameAlreadyExists) {
		this.genderNameAlreadyExists = genderNameAlreadyExists;
	}

	public String getExistsById() {
		return existsById;
	}

	public void setExistsById(String existsById) {
		this.existsById = existsById;
	}

	

	
	
}
