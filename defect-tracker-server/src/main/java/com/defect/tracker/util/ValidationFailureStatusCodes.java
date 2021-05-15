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
	private String ProjectNameAlreadyExists;
	@Value("${validation.project.existsById}")
	private String existsByProjectId;
	@Value("${validation.project.projectById}")
	private String projectById;
	@Value("${validation.project.projectExistsById}")
	private String projectExistsById;

	// Employee
	@Value("${validation.employee.AlreadyExists}")
	private String employeeEmailAlreadyExists;
	@Value("${validation.employee.AlreadyExistsId}")
	private String employeeAlreadyExists;
	@Value("${validation.employee.ExistsId}")
	private String ExistsById;

	// Module
	@Value("${validation.module.AlreadyExists}")
	private String moduleNameAlreadyExists;
	@Value("${validation.module.moduleById}")
	private String moduleById;
	@Value("${validation.module.existsById}")
	private String moduleExistsById;

	// SubModule
	@Value("${validation.subModule.AlreadyExists}")
	private String subModuleAlreadyExists;
	@Value("${validation.subModule.existsById}")
	private String subModuleExistsById;

	// ProjectAllocation
	@Value("${validation.projectAllocation.EmployeeIdAlreadyExists}")
	private String EmployeeIdAlreadyExists;
	@Value("${validation.projectAllocation.ExistsById}")
	private String existsById;
	@Value("${validation.projectAllocation.ProjectAllocationById}")
	private String ProjectAllocationById;

	// Severity
	@Value("${validation.severity.SeverityNameAlreadyExists}")
	private String SeverityNameAlreadyExists;
	@Value("${validation.severity.SeverityById}")
	private String SeverityById;

	// login
	@Value("${validation.login.exixtsByEmail}")
	private String existsByEmail;

	// priority
	@Value("${validation.priority.priorityAlreadyExists}")
	private String priorityAlreadyExists;
	@Value("${validation.priority.PriorityById}")
	private String priorityById;

	// Gender
	@Value("${validation.gender.AlreadyExists}")
	private String genderAlreadyExists;
	@Value("${validation.gender.genderExistsById}")
	private String genderExistsById;

	// Designation
	@Value("${validation.designation.ExistsById}")
	private String designationExistsById;
	@Value("${validation.designation.designationById}")
	public String designationById;
	@Value("${validation.designation.AlreadyExists}")
	private String designationNameAlreadyExists;

	public String getExistsByProjectId() {
		return existsByProjectId;
	}

	public void setExistsByProjectId(String existsByProjectId) {
		this.existsByProjectId = existsByProjectId;
	}

	public String getProjectExistsById() {
		return projectExistsById;
	}

	public void setProjectExistsById(String projectExistsById) {
		this.projectExistsById = projectExistsById;
	}

	public String getProjectNameAlreadyExists() {
		return ProjectNameAlreadyExists;
	}

	public void setProjectNameAlreadyExists(String projectNameAlreadyExists) {
		ProjectNameAlreadyExists = projectNameAlreadyExists;
	}

	public String getEmployeeEmailAlreadyExists() {
		return employeeEmailAlreadyExists;
	}

	public void setEmployeeEmailAlreadyExists(String employeeEmailAlreadyExists) {
		this.employeeEmailAlreadyExists = employeeEmailAlreadyExists;
	}

	public String getEmployeeExistsById() {
		return ExistsById;
	}

	public void setEmployeeExistsById(String employeeExistsById) {
		this.ExistsById = employeeExistsById;
	}

	public String getEmployeeAlreadyExists() {
		return employeeAlreadyExists;
	}

	public void setEmployeeAlreadyExists(String employeeAlreadyExists) {
		this.employeeAlreadyExists = employeeAlreadyExists;
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

	public String getExistsByEmail() {
		return existsByEmail;
	}

	public void setExistsByEmail(String existsByEmail) {
		this.existsByEmail = existsByEmail;
	}

	public String getPriorityAlreadyExists() {
		return priorityAlreadyExists;
	}

	public void setPriorityAlreadyExists(String priorityAlreadyExists) {
		this.priorityAlreadyExists = priorityAlreadyExists;
	}

	public String getPriorityById() {
		return priorityById;
	}

	public void setPriorityById(String priorityById) {
		this.priorityById = priorityById;
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

	public String getDesignationExistsById() {
		return designationExistsById;
	}

	public void setDesignationExistsById(String designationExistsById) {
		this.designationExistsById = designationExistsById;
	}

	public String getDesignationById() {
		return designationById;
	}

	public void setDesignationById(String designationById) {
		this.designationById = designationById;
	}

	public String getDesignationNameAlreadyExists() {
		return designationNameAlreadyExists;
	}

	public void setDesignationNameAlreadyExists(String designationNameAlreadyExists) {
		this.designationNameAlreadyExists = designationNameAlreadyExists;
	}

}