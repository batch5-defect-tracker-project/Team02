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
	@Value("${validation.projectAllocator.EmployeeIdAlreadyExists}")
	private String EmployeeIdAlreadyExists;
	@Value("${validation.projectAllocator.ExistsById}")
	private String existsById;
	@Value("${validation.projectAllocator.ProjectAllocatorById}")
	private String ProjectAllocatorById;
	@Value("${validation.severity.SeverityNameAlreadyExists}")
	private String SeverityNameAlreadyExists;
	@Value("${validation.severity.SeverityById}")
	private String SeverityById;
	
	

	

	public String getSeverityNameAlreadyExists() {
		return SeverityNameAlreadyExists;
	}

	public void setSeverityNameAlreadyExists(String severityNameAlreadyExists) {
		SeverityNameAlreadyExists = severityNameAlreadyExists;
	}

	public String getSeverityById() {
		return SeverityById;
	}

	public void setSeverityById(String severityById) {
		SeverityById = severityById;
	}

	public String getProjectAllocatorById() {
		return ProjectAllocatorById;
	}

	public void setProjectAllocatorById(String projectAllocatorById) {
		ProjectAllocatorById = projectAllocatorById;
	}

	public String getExistsById() {
		return existsById;
	}

	public void setExistsById(String existsById) {
		this.existsById = existsById;
	}

	public String getProjectNameAlreadyExists() {
		return projectNameAlreadyExists;
	}

	public void setProjectNameAlreadyExists(String projectNameAlreadyExists) {
		this.projectNameAlreadyExists = projectNameAlreadyExists;
	}

	public String getEmployeeIdAlreadyExists() {
		return EmployeeIdAlreadyExists;
	}

	public void setEmployeeIdAlreadyExists(String employeeIdAlreadyExists) {
		EmployeeIdAlreadyExists = employeeIdAlreadyExists;
	}

	


	}

	




