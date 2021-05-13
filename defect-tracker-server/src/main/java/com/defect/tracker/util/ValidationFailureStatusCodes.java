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

	//Project
	@Value("${validation.project.AlreadyExists}")
	private String projectNameAlreadyExists;

	@Value("${validation.project.existsById}")
	private String projectExistsById;

	@Value("${validation.project.projectById}")
	private String projectById;
	
	//Employee
	@Value("${validation.employee.AlreadyExists}")
	private String employeeEmailAlreadyExists;

	@Value("${validation.employee.ExistsId}")
	private String employeeAlreadyExists;

	@Value("${validation.employee.AlreadyExistsId}")
	private String employeeExistsById;
	
	//Gender
	@Value("${validation.gender.AlreadyExists}")
	private String genderAlreadyExists;
	
	@Value("${validation.gender.AlreadyExistsId}")
	private String genderExistsById;

	//Module
	@Value("${validation.module.AlreadyExists}")
	private String moduleNameAlreadyExists;

	@Value("${validation.module.moduleById}")
	private String moduleById;

	@Value("${validation.module.existsById}")
	private String moduleExistsById;
	
	//SubModule
	@Value("${validation.subModule.AlreadyExists}")
	private String subModuleAlreadyExists;
	
	@Value("${validation.subModule.existsById}")
	private String subModuleExistsById;
	
	//Designation
	@Value("${validation.designation.AlreadyExists}")
	private String designationNameAlreadyExists;
	
	
	//Getters Setters
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

	public String getEmployeeAlreadyExists() {
		return employeeAlreadyExists;
	}

	public void setEmployeeAlreadyExists(String employeeAlreadyExists) {
		this.employeeAlreadyExists = employeeAlreadyExists;
	}

	public String getEmployeeExistsById() {
		return employeeExistsById;
	}

	public void setEmployeeExistsById(String employeeExistsById) {
		this.employeeExistsById = employeeExistsById;
	}

	public String getGenderAlreadyExists() {
		return genderAlreadyExists;
	}

	public void setGenderAlreadyExists(String genderAlreadyExists) {
		this.genderAlreadyExists = genderAlreadyExists;
	}

	public String getGenderExistsById() {
		return genderExistsById;
	}

	public void setGenderExistsById(String genderExistsById) {
		this.genderExistsById = genderExistsById;
	}

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

	public String getSubModuleAlreadyExists() {
		return subModuleAlreadyExists;
	}

	public void setSubModuleAlreadyExists(String subModuleAlreadyExists) {
		this.subModuleAlreadyExists = subModuleAlreadyExists;
	}

	public String getSubModuleExistsById() {
		return subModuleExistsById;
	}

	public void setSubModuleExistsById(String subModuleExistsById) {
		this.subModuleExistsById = subModuleExistsById;
	}

	public String getDesignationNameAlreadyExists() {
		return designationNameAlreadyExists;
	}

	public void setDesignationNameAlreadyExists(String designationNameAlreadyExists) {
		this.designationNameAlreadyExists = designationNameAlreadyExists;
	}
	
	
	
			
}
