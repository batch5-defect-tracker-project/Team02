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
	private String proNameAlreadyExists;

	@Value("${validation.subModule.AlreadyExists}")
	private String subModuleNameAlreadyExists;

	@Value("${validation.subModule.existsById}")
	private String subModuleExistsById;

	public String getSubModuleExistsById() {
		return subModuleExistsById;
	}

	public void setSubModuleExistsById(String subModuleExistsById) {
		this.subModuleExistsById = subModuleExistsById;
	}

	@Value("${validation.subModule.SubModuleById}")
	private String SubModuleById;

	public String getProNameAlreadyExists() {
		return proNameAlreadyExists;
	}

	public void setProNameAlreadyExists(String proNameAlreadyExists) {
		this.proNameAlreadyExists = proNameAlreadyExists;
	}

	public String getSubModuleNameAlreadyExists() {
		return subModuleNameAlreadyExists;
	}

	public void setSubModuleNameAlreadyExists(String subModuleNameAlreadyExists) {
		this.subModuleNameAlreadyExists = subModuleNameAlreadyExists;
	}

	public String getSubModuleById() {
		return SubModuleById;
	}

	public void setSubModuleById(String subModuleById) {
		SubModuleById = subModuleById;
	}
}
