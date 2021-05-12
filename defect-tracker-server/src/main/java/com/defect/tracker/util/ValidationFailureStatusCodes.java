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

	@Value("${validation.employee.AlreadyExists}")
	private String employeeEmailAlreadyExists;
	
	@Value("${validation.gender.AlreadyExists}")
	private String genderNameAlreadyExists;


	private String proNameAlreadyExists;
	

	@Value("${validation.subModule.AlreadyExists}")
	private String subModuleAlreadyExists;
	
	@Value("${validation.subModule.existsById}")
	private String existsById;



	public String getSubModuleAlreadyExists() {
		return subModuleAlreadyExists;
	}

	public void setSubModuleAlreadyExists(String subModuleAlreadyExists) {
		this.subModuleAlreadyExists = subModuleAlreadyExists;

	@Value("${validation.module.AlreadyExists}")
	private String moduleNameAlreadyExists;
	
	@Value("${validation.module.existsById}")
	private String existsById;
	
	@Value("${validation.designation.AlreadyExists}")
	private String designationNameAlreadyExists;
	
	@Value("${validation.module.moduleById}")
	private String moduleById;

	
	public String getModuleById() {
		return moduleById;
	}

	public void setModuleById(String moduleById) {
		this.moduleById = moduleById;
	}

	public String getDesignationNameAlreadyExists() {
		return designationNameAlreadyExists;
	}

	public void setDesignationNameAlreadyExists(String designationNameAlreadyExists) {
		this.designationNameAlreadyExists = designationNameAlreadyExists;
	}

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


	public void setExistsById(String existsById) {
		this.existsById = existsById;
	}

	public String getProjectById() {
		return projectById;
	}

	public void setProjectById(String projectById) {
		this.projectById = projectById;
	}



	


	@Value("${validation.employee.AlreadyExistsId}")
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


	public String getProNameAlreadyExists() {
		return proNameAlreadyExists;
	
	}


	public void setGenderNameAlreadyExists(String genderNameAlreadyExists) {
		this.genderNameAlreadyExists = genderNameAlreadyExists;
	}

	public String getExistsById() {
		return existsById;
	}

	public void setExistsById(String existsById) {
		this.existsById = existsById;


	public String getModuleNameAlreadyExists() {
		return moduleNameAlreadyExists;
	}

	public void setModuleNameAlreadyExists(String moduleNameAlreadyExists) {
		this.moduleNameAlreadyExists = moduleNameAlreadyExists;

	
	}

}
