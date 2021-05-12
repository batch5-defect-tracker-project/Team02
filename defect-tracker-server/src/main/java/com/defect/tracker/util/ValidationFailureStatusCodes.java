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
	@Value("${validation.login.exixtsByEmail}")
	private String existsByEmail;
	@Value("${validation.priority.PriorityAlreadyExists}")
	private String PriorityAlreadyExists;
	@Value("${validation.priority.PriorityById}")
	private String PriorityById;

	public String getProjectNameAlreadyExists() {
		return projectNameAlreadyExists;
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

}
