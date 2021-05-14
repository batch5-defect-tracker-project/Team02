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
	
	@Value("${validation.employee.AlreadyExistsId}")
	private String employeeExistsById;
	
	
	// Gender
	@Value("${validation.gender.AlreadyExists}")
	private String genderNameAlreadyExists;
	
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

	//Desiganation
	@Value("${validation.designation.AlreadyExists}")
	private String designationNameAlreadyExists;
	
	//ProjectAllocation
	@Value("${validation.projectAllocation.EmployeeIdAlreadyExists}")
	private String EmployeeIdAlreadyExists;
	
	@Value("${validation.projectAllocation.ExistsById}")
	private String existsById;
	
	@Value("${validation.projectAllocation.ProjectAllocationById}")
	private String ProjectAllocationById;
	
	//Severity
	@Value("${validation.severity.SeverityNameAlreadyExists}")
	private String SeverityNameAlreadyExists;
	
	@Value("${validation.severity.SeverityById}")
	private String SeverityById;

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

	public String getEmployeeExistsById() {
		return employeeExistsById;
	}

	public void setEmployeeExistsById(String employeeExistsById) {
		this.employeeExistsById = employeeExistsById;
	}

	public String getGenderNameAlreadyExists() {
		return genderNameAlreadyExists;
	}

	public void setGenderNameAlreadyExists(String genderNameAlreadyExists) {
		this.genderNameAlreadyExists = genderNameAlreadyExists;
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

	public String getEmployeeIdAlreadyExists() {
		return EmployeeIdAlreadyExists;
	}

	public void setEmployeeIdAlreadyExists(String employeeIdAlreadyExists) {
		EmployeeIdAlreadyExists = employeeIdAlreadyExists;
	}

	public String getExistsById() {
		return existsById;
	}

	public void setExistsById(String existsById) {
		this.existsById = existsById;
	}

	public String getProjectAllocationById() {
		return ProjectAllocationById;
	}

	public void setProjectAllocationById(String projectAllocationById) {
		ProjectAllocationById = projectAllocationById;
	}

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
}
	