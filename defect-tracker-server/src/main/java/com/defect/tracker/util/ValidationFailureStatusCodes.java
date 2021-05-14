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

	@Value("${validation.type.AlreadyExists}")
	private String typeNameAlreadyExists;

	@Value("${validation.type.AlreadyExists}")
	private String typeById;

	@Value("${validation.defect.AlreadyExists}")
	private String defectIdAlreadyExists;
	
	@Value("${validation.defect.moduleAlreadyExists}")
	private String moduleIdAlreadyExists;
	
	@Value("${validation.defect.ExistsDefectById}")
	private String ExistsDefectById;

	public String getModuleIdAlreadyExists() {
		return moduleIdAlreadyExists;
	}

	public void setModuleIdAlreadyExists(String moduleIdAlreadyExists) {
		this.moduleIdAlreadyExists = moduleIdAlreadyExists;
	}

	public void setProNameAlreadyExists(String proNameAlreadyExists) {
		this.proNameAlreadyExists = proNameAlreadyExists;
	}

	public String getProNameAlreadyExists() {
		return proNameAlreadyExists;
	}

	public void setTypeNameAlreadyExists(String typeNameAlreadyExists) {
		this.typeNameAlreadyExists = typeNameAlreadyExists;
	}

	public String getTypeNameAlreadyExists() {
		return typeNameAlreadyExists;
	}

	public String getTypeById() {
		return typeById;
	}

	public void setTypeById(String typeById) {
		this.typeById = typeById;
	}

	public String getDefectIdAlreadyExists() {

		return defectIdAlreadyExists;

	}

	public void setDefectIdAlreadyExists(String defectIdAlreadyExists) {
		this.defectIdAlreadyExists = defectIdAlreadyExists;
	}

	public String getExistsDefectById() {
		return ExistsDefectById;
	}

	public void setExistsDefectById(String existsDefectById) {
		ExistsDefectById = existsDefectById;
	}

}
