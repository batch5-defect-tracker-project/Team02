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
	@Value("${validation.project.ExistsById}")
	private String existsByProjectId;
	@Value("${validation.project.projectExistsById}")
	private String projectExistsById;

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
	private String projectAllocationById;
	@Value("${validation.projectAllocation.ExistsById}")
	private String projectAllocationExistsById;

	// Gender
	@Value("${validation.gender.AlreadyExists}")
	private String genderAlreadyExists;

	@Value("${validation.gender.genderExistsById}")
	private String genderExistsById;

	// Module
	@Value("${validation.module.AlreadyExists}")
	private String moduleNameAlreadyExists;

	@Value("${validation.module.ModuleById}")
	private String moduleById;

	@Value("${validation.module.ExistsById}")
	private String moduleExistsById;

	// SubModule
	@Value("${validation.subModule.AlreadyExists}")
	private String subModuleAlreadyExists;

	@Value("${validation.subModule.ExistsById}")
	private String subModuleExistsById;

	// Designation
	@Value("${validation.designation.AlreadyExists}")
	private String designationNameAlreadyExists;

	@Value("${validation.designation.ExistsById}")
	private String designationExistsById;

	@Value("${validation.designation.designationById}")
	public String designationById;

	// Employee
	@Value("${validation.employee.AlreadyExists}")
	private String employeeEmailAlreadyExists;

	@Value("${validation.employee.ExistsById}")
	private String employeeAlreadyExists;

	@Value("${validation.employee.AlreadyExistsId}")
	private String employeeExistsById;
	// Type
	@Value("${validation.type.AlreadyExists}")
	private String typeNameAlreadyExists;

	@Value("${validation.type.IdAlreadyExists}")
	private String typeById;
	// Defect
	@Value("${validation.defect.AlreadyExists}")
	private String defectIdAlreadyExists;

	@Value("${validation.defect.moduleAlreadyExists}")
	private String moduleIdAlreadyExists;

	@Value("${validation.defect.ExistsDefectById}")
	private String ExistsDefectById;

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

	public String getProjectExistsById() {
		return projectExistsById;
	}

	public void setProjectExistsById(String projectExistsById) {
		this.projectExistsById = projectExistsById;
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
		return projectAllocationById;
	}

	public void setProjectAllocationById(String projectAllocationById) {
		this.projectAllocationById = projectAllocationById;
	}

	public String getProjectAllocationExistsById() {
		return projectAllocationExistsById;
	}

	public void setProjectAllocationExistsById(String projectAllocationExistsById) {
		this.projectAllocationExistsById = projectAllocationExistsById;
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

	public String getTypeNameAlreadyExists() {
		return typeNameAlreadyExists;
	}

	public void setTypeNameAlreadyExists(String typeNameAlreadyExists) {
		this.typeNameAlreadyExists = typeNameAlreadyExists;
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

	public String getModuleIdAlreadyExists() {
		return moduleIdAlreadyExists;
	}

	public void setModuleIdAlreadyExists(String moduleIdAlreadyExists) {
		this.moduleIdAlreadyExists = moduleIdAlreadyExists;
	}

	public String getExistsDefectById() {
		return ExistsDefectById;
	}

	public void setExistsDefectById(String existsDefectById) {
		ExistsDefectById = existsDefectById;
	}

}
