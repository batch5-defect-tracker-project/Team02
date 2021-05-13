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
	private String existsByProjectId;

	@Value("${validation.project.projectById}")
	private String projectById;

	@Value("${validation.login.exixtsByEmail}")
	private String existsByEmail;

	@Value("${validation.priority.PriorityAlreadyExists}")
	private String PriorityAlreadyExists;

	@Value("${validation.priority.PriorityById}")
	private String PriorityById;

	@Value("${validation.employee.AlreadyExists}")
	private String employeeEmailAlreadyExists;

	@Value("${validation.gender.AlreadyExists}")
	private String genderNameAlreadyExists;

	@Value("${validation.module.AlreadyExists}")
	private String moduleNameAlreadyExists;

	@Value("${validation.module.existsById}")
	private String existsByModuleId;

	@Value("${validation.employee.AlreadyExistsId}")
	private String existsByEmployeeId;

	@Value("${validation.gender.existsByGenderId}")
	private String existsByGenderId;

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
		return PriorityAlreadyExists;
	}

	public void setPriorityAlreadyExists(String priorityAlreadyExists) {
		PriorityAlreadyExists = priorityAlreadyExists;
	}

	public String getPriorityById() {
		return PriorityById;
	}

	public void setPriorityById(String priorityById) {
		PriorityById = priorityById;
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

	public String getModuleNameAlreadyExists() {
		return moduleNameAlreadyExists;
	}

	public void setModuleNameAlreadyExists(String moduleNameAlreadyExists) {
		this.moduleNameAlreadyExists = moduleNameAlreadyExists;
	}

	public String getExistsByModuleId() {
		return existsByModuleId;
	}

	public void setExistsByModuleId(String existsByModuleId) {
		this.existsByModuleId = existsByModuleId;
	}

	public String getExistsByEmployeeId() {
		return existsByEmployeeId;
	}

	public void setExistsByEmployeeId(String existsByEmployeeId) {
		this.existsByEmployeeId = existsByEmployeeId;
	}

	public String getExistsByGenderId() {
		return existsByGenderId;
	}

	public void setExistsByGenderId(String existsByGenderId) {
		this.existsByGenderId = existsByGenderId;
	}

	

}
