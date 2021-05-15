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
	
	
    //project
	@Value("${validation.project.AlreadyExists}")
	private String projectNameAlreadyExists;

	@Value("${validation.project.existsById}")
	private String projectExistsById;
	
	@Value("${validation.project.projectById}")
	private String projectById;
	
	//employee
	@Value("${validation.employee.AlreadyExists}")
	private String employeeEmailAlreadyExists;
	
	@Value("${validation.employee.AlreadyExistsId}")
	private String employeeExistsById;

	@Value("${validation.employee.ExistsId}")
	private String employeeAlreadyExists;
	
	public String getEmployeeAlreadyExists() {
		return employeeAlreadyExists;
	}

	public void setEmployeeAlreadyExists(String employeeAlreadyExists) {
		this.employeeAlreadyExists = employeeAlreadyExists;
	}

	//gender
	@Value("${validation.gender.AlreadyExists}")
	private String genderNameAlreadyExists;
	
	

	@Value("${validation.gender.AlreadyExistsId}")
	private String genderExistsById;

	//subModule
	@Value("${validation.subModule.AlreadyExists}")
	private String subModuleNameAlreadyExists;
	
	@Value("${validation.subModule.existsById}")
	private String subModuleExistsById;

	@Value("${validation.subModule.SubModuleById}")
	private String SubModuleById;

	
	//module
	@Value("${validation.module.AlreadyExists}")
	private String moduleNameAlreadyExists;
	
	@Value("${validation.module.moduleById}")
	private String moduleById;

	@Value("${validation.module.existsById}")
	private String moduleExistsById;

	
	public String getModuleNameAlreadyExists() {
		return moduleNameAlreadyExists;
	}

	public void setModuleNameAlreadyExists(String moduleNameAlreadyExists) {
		this.moduleNameAlreadyExists = moduleNameAlreadyExists;
	}

	public String getModuleById() {
		return moduleById;
	}

	public void setModuleById(String moduleById) {
		this.moduleById = moduleById;
	}

	public String getModuleExistsById() {
		return moduleExistsById;
	}

	public void setModuleExistsById(String moduleExistsById) {
		this.moduleExistsById = moduleExistsById;
	}

	

	public String getProjectNameAlreadyExists() {
		return projectNameAlreadyExists;
	}

	public void setProjectNameAlreadyExists(String projectNameAlreadyExists) {
		this.projectNameAlreadyExists = projectNameAlreadyExists;
	}

	public String getProjectExistsById() {
		return projectExistsById;
	}

	public void setProjectExistsById(String projectExistsById) {
		this.projectExistsById = projectExistsById;
	}

	public String getProjectById() {
		return projectById;
	}

	public void setProjectById(String projectById) {
		this.projectById = projectById;
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

	public String getSubModuleNameAlreadyExists() {
		return subModuleNameAlreadyExists;
	}

	public void setSubModuleNameAlreadyExists(String subModuleNameAlreadyExists) {
		this.subModuleNameAlreadyExists = subModuleNameAlreadyExists;
	}

	public String getSubModuleExistsById() {
		return subModuleExistsById;
	}

	public void setSubModuleExistsById(String subModuleExistsById) {
		this.subModuleExistsById = subModuleExistsById;
	}

	public String getSubModuleById() {
		return SubModuleById;
	}

	public void setSubModuleById(String subModuleById) {
		SubModuleById = subModuleById;
	}

	public String getEmployeeExistsById() {
		return employeeExistsById;
	}

	public void setEmployeeExistsById(String employeeExistsById) {
		this.employeeExistsById = employeeExistsById;
	}

	public String getGenderExistsById() {
		return genderExistsById;
	}

	public void setGenderExistsById(String genderExistsById) {
		this.genderExistsById = genderExistsById;
	}
	

}
