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

	// Project
	@Value("${validation.project.AlreadyExists}")
	private String projectNameAlreadyExists;

	@Value("${validation.project.ExistsById}")
	private String projectExistsById;

	@Value("${validation.project.ExistsByName}")
	private String projectExistsByName;

	// Employee
	@Value("${validation.employee.AlreadyExists}")
	private String employeeEmailAlreadyExists;

	@Value("${validation.employee.ExistsById}")
	private String employeeExistsById;

	// Gender
	@Value("${validation.genderName.AlreadyExists}")
	private String genderNameAlreadyExists;

	@Value("${validation.genderName.ExistsById}")
	private String genderExistsById;

	// Designation
	@Value("${validation.designation.AlreadyExists}")
	private String designationNameAlreadyExists;

	@Value("${validation.designation.ExistsById}")
	private String designationExistsById;

	// Login
	@Value("${validation.login.ExistsByEmail}")
	private String existsByEmail;

	// Module
	@Value("${validation.module.AlreadyExists}")
	private String moduleNameAlreadyExists;

	@Value("${validation.module.ExistsById}")
	private String moduleExistsById;

	// SubModule
	@Value("${validation.subModule.AlreadyExists}")
	private String subModuleNameAlreadyExists;

	@Value("${validation.subModule.ExistsById}")
	private String subModuleExistsById;

	// Defect
	@Value("${validation.defect.AlreadyExists}")
	private String moduleIdAlreadyExists;

	@Value("${validation.defect.ExistsById}")
	private String defectExistsById;

	// Project Allocation
	@Value("${validation.projectAllocation.AlreadyExists}")
	private String employeeIdAlreadyExists;

	@Value("${validation.projectAllocation.ExistsById}")
	private String projectAllocationExistsById;

	// Type
	@Value("${validation.type.AlreadyExists}")
	private String typeNameAlreadyExists;

	@Value("${validation.type.ExistsById}")
	private String typeExistsById;

	// Severity
	@Value("${validation.severity.AlreadyExists}")
	private String severityNameAlreadyExists;

	@Value("${validation.severity.ExistsById}")
	private String severityExistsById;

	// Priority
	@Value("${validation.priority.AlreadyExists}")
	private String priorityNameAlreadyExists;

	@Value("${validation.priority.ExistsById}")
	private String priorityExistsById;

	// Status
	@Value("${validation.status.AlreadyExists}")
	private String statusNameAlreadyExists;

	@Value("${validation.status.ExistsById}")
	private String statusExistsById;

	// Getters Setters
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

	public String getProjectExistsByName() {
		return projectExistsByName;
	}

	public void setProjectExistsByName(String projectExistsByName) {
		this.projectExistsByName = projectExistsByName;
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

	public String getGenderExistsById() {
		return genderExistsById;
	}

	public void setGenderExistsById(String genderExistsById) {
		this.genderExistsById = genderExistsById;
	}

	public String getDesignationNameAlreadyExists() {
		return designationNameAlreadyExists;
	}

	public void setDesignationNameAlreadyExists(String designationNameAlreadyExists) {
		this.designationNameAlreadyExists = designationNameAlreadyExists;
	}

	public String getDesignationExistsById() {
		return designationExistsById;
	}

	public void setDesignationExistsById(String designationExistsById) {
		this.designationExistsById = designationExistsById;
	}

	public String getExistsByEmail() {
		return existsByEmail;
	}

	public void setExistsByEmail(String existsByEmail) {
		this.existsByEmail = existsByEmail;
	}

	public String getModuleNameAlreadyExists() {
		return moduleNameAlreadyExists;
	}

	public void setModuleNameAlreadyExists(String moduleNameAlreadyExists) {
		this.moduleNameAlreadyExists = moduleNameAlreadyExists;
	}

	public String getModuleExistsById() {
		return moduleExistsById;
	}

	public void setModuleExistsById(String moduleExistsById) {
		this.moduleExistsById = moduleExistsById;
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

	public String getModuleIdAlreadyExists() {
		return moduleIdAlreadyExists;
	}

	public void setModuleIdAlreadyExists(String moduleIdAlreadyExists) {
		this.moduleIdAlreadyExists = moduleIdAlreadyExists;
	}

	public String getDefectExistsById() {
		return defectExistsById;
	}

	public void setDefectExistsById(String defectExistsById) {
		this.defectExistsById = defectExistsById;
	}

	public String getEmployeeIdAlreadyExists() {
		return employeeIdAlreadyExists;
	}

	public void setEmployeeIdAlreadyExists(String employeeIdAlreadyExists) {
		this.employeeIdAlreadyExists = employeeIdAlreadyExists;
	}

	public String getProjectAllocationExistsById() {
		return projectAllocationExistsById;
	}

	public void setProjectAllocationExistsById(String projectAllocationExistsById) {
		this.projectAllocationExistsById = projectAllocationExistsById;
	}

	public String getTypeNameAlreadyExists() {
		return typeNameAlreadyExists;
	}

	public void setTypeNameAlreadyExists(String typeNameAlreadyExists) {
		this.typeNameAlreadyExists = typeNameAlreadyExists;
	}

	public String getTypeExistsById() {
		return typeExistsById;
	}

	public void setTypeExistsById(String typeExistsById) {
		this.typeExistsById = typeExistsById;
	}

	public String getSeverityNameAlreadyExists() {
		return severityNameAlreadyExists;
	}

	public void setSeverityNameAlreadyExists(String severityNameAlreadyExists) {
		this.severityNameAlreadyExists = severityNameAlreadyExists;
	}

	public String getSeverityExistsById() {
		return severityExistsById;
	}

	public void setSeverityExistsById(String severityExistsById) {
		this.severityExistsById = severityExistsById;
	}

	public String getPriorityNameAlreadyExists() {
		return priorityNameAlreadyExists;
	}

	public void setPriorityNameAlreadyExists(String priorityNameAlreadyExists) {
		this.priorityNameAlreadyExists = priorityNameAlreadyExists;
	}

	public String getPriorityExistsById() {
		return priorityExistsById;
	}

	public void setPriorityExistsById(String priorityExistsById) {
		this.priorityExistsById = priorityExistsById;
	}

	public String getStatusNameAlreadyExists() {
		return statusNameAlreadyExists;
	}

	public void setStatusNameAlreadyExists(String statusNameAlreadyExists) {
		this.statusNameAlreadyExists = statusNameAlreadyExists;
	}

	public String getStatusExistsById() {
		return statusExistsById;
	}

	public void setStatusExistsById(String statusExistsById) {
		this.statusExistsById = statusExistsById;
	}

}
