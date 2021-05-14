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
	// project
	@Value("${validation.project.AlreadyExists}")
	private String projectNameAlreadyExists;
	@Value("${validation.project.existsById}")
	private String existsByProjectId;
	@Value("${validation.project.projectById}")
	private String projectById;
	@Value("${validation.project.projectExistsById}")
	private String ProjectExistsById;

	// login
	@Value("${validation.login.exixtsByEmail}")
	private String existsByEmail;

	// priority
	@Value("${validation.priority.priorityAlreadyExists}")
	private String priorityAlreadyExists;
	@Value("${validation.priority.PriorityById}")
	private String priorityById;

	// projectAllocation
	@Value("${validation.projectAllocation.employeeIdAlreadyExists}")
	private String EmployeeIdAlreadyExists;
	@Value("${validation.projectAllocation.projectAllocationById}")
	private String ProjectAllocationById;
	@Value("${validation.projectAllocation.existsById}")
	private String ExistsById;

	// Designation
	@Value("${validation.designation.designationNameAlreadyExists}")
	private String designationNameAlreadyExists;

	// Employee
	@Value("${validation.employee.employeeEmailAlreadyExists}")
	private String employeeEmailAlreadyExists;
	@Value("${validation.employee.employeeExistsById}")
	private String employeeExistsById;

	// Gender
	@Value("${validation.gender.genderAlreadyExists}")
	private String genderAlreadyExists;
	@Value("${validation.gender.genderExistsById}")
	private String genderExistsById;

	// module
	@Value("${validation.module.moduleNameAlreadyExists}")
	private String moduleNameAlreadyExists;
	@Value("${validation.module.moduleExistsById}")
	private String moduleExistsById;
	@Value("${validation.module.moduleById}")
	private String moduleById;

	// subModule
	@Value("${validation.subModule.subModuleAlreadyExists}")
	private String subModuleAlreadyExists;
	@Value("${validation.subModule.subModuleExistsById}")
	private String subModuleExistsById;

	public String getProjectNameAlreadyExists() {
		return projectNameAlreadyExists;
	}

	public void setProjectNameAlreadyExists(String projectNameAlreadyExists) {
		this.projectNameAlreadyExists = projectNameAlreadyExists;
	}

	public String getExistsByProjectId() {
		return existsByProjectId;
	}

	public void setExistsByProjectId(String existsByProjectId) {
		this.existsByProjectId = existsByProjectId;
	}

	public String getProjectById() {
		return projectById;
	}

	public void setProjectById(String projectById) {
		this.projectById = projectById;
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

	public String getEmployeeIdAlreadyExists() {
		return EmployeeIdAlreadyExists;
	}

	public void setEmployeeIdAlreadyExists(String employeeIdAlreadyExists) {
		EmployeeIdAlreadyExists = employeeIdAlreadyExists;
	}

	public String getProjectAllocationById() {
		return ProjectAllocationById;
	}

	public void setProjectAllocationById(String projectAllocationById) {
		ProjectAllocationById = projectAllocationById;
	}

	public String getExistsById() {
		return ExistsById;
	}

	public void setExistsById(String existsById) {
		ExistsById = existsById;
	}

	public String getDesignationNameAlreadyExists() {
		return designationNameAlreadyExists;
	}

	public void setDesignationNameAlreadyExists(String designationNameAlreadyExists) {
		this.designationNameAlreadyExists = designationNameAlreadyExists;
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

	public String getModuleExistsById() {
		return moduleExistsById;
	}

	public void setModuleExistsById(String moduleExistsById) {
		this.moduleExistsById = moduleExistsById;
	}

	public String getModuleById() {
		return moduleById;
	}

	public void setModuleById(String moduleById) {
		this.moduleById = moduleById;
	}

	public String getProjectExistsById() {
		return ProjectExistsById;
	}

	public void setProjectExistsById(String projectExistsById) {
		ProjectExistsById = projectExistsById;
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

}
