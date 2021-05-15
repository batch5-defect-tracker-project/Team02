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
	
	
    //project
	@Value("${validation.project.AlreadyExists}")
	private String projectNameAlreadyExists;
	
	@Value("${validation.project.projectById}")
	private String projectById;

	@Value("${validation.project.ExistsById}")
   private String projectExistsById;
  
	@Value("${validation.project.projectExistsById}")
	private String existsByProjectId;
	

	// Employee
	@Value("${validation.employee.AlreadyExists}")
 private String employeeEmailAlreadyExists;

 @Value("${validation.employee.ExistsId}")
 private String employeeAlreadyExists;

 @Value("${validation.employee.AlreadyExistsId}")
 private String employeeExistsById;

	// login
	@Value("${validation.login.exixtsByEmail}")
	private String existsByEmail;

	// priority
	@Value("${validation.priority.priorityAlreadyExists}")
	private String priorityAlreadyExists;
	@Value("${validation.priority.PriorityById}")
	private String priorityById;

	
	public String getEmployeeAlreadyExists() {
		return employeeAlreadyExists;
	}

	public void setEmployeeAlreadyExists(String employeeAlreadyExists) {
		this.employeeAlreadyExists = employeeAlreadyExists;
	}

	//gender
	@Value("${validation.gender.AlreadyExists}")
	private String genderNameAlreadyExists;
	
	@Value("${validation.gender.AlreadyExistsId}")
	private String genderExistsById;

	//subModule
	@Value("${validation.subModule.AlreadyExists}")
	private String subModuleNameAlreadyExists;
	
	@Value("${validation.subModule.existsById}")
	private String subModuleExistsById;

	@Value("${validation.subModule.SubModuleById}")
	private String SubModuleById;

	
	//module
	@Value("${validation.module.AlreadyExists}")
	private String moduleNameAlreadyExists;
	
	@Value("${validation.module.moduleById}")
	private String moduleById;

	@Value("${validation.module.existsById}")
	private String moduleExistsById;

	
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


	// projectAllocation
	@Value("${validation.projectAllocation.employeeIdAlreadyExists}")
	private String EmployeeIdAlreadyExists;
	@Value("${validation.projectAllocation.projectAllocationById}")
	private String projectAllocationById;
	@Value("${validation.projectAllocation.ExistsById}")
	private String projectAllocationExistsById;

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


	// Designation
	@Value("${validation.designation.AlreadyExists}")
	private String designationNameAlreadyExists;

	
	//Project Allocation
	@Value("${validation.projectAllocator.EmployeeIdAlreadyExists}")
	private String EmployeeIdAlreadyExists;
	
	@Value("${validation.projectAllocator.ExistsById}")
	private String existsById;
	
	@Value("${validation.projectAllocator.ProjectAllocatorById}")
	private String ProjectAllocatorById;
	
	

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

	public String getEmployeeEmailAlreadyExists() {
		return employeeEmailAlreadyExists;

	}

	public void setPriorityAlreadyExists(String priorityAlreadyExists) {
		this.priorityAlreadyExists = priorityAlreadyExists;
	}

	public String getPriorityById() {
		return priorityById;
	}


	public String getEmployeeEmailAlreadyExists() {
		return employeeEmailAlreadyExists;
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


	public void setGenderNameAlreadyExists(String genderNameAlreadyExists) {
		this.genderNameAlreadyExists = genderNameAlreadyExists;
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

	public String getSubModuleById() {
		return SubModuleById;
	}

	public void setSubModuleById(String subModuleById) {
		SubModuleById = subModuleById;
	}

	public String getEmployeeExistsById() {
		return employeeExistsById;
	}

	public void setEmployeeExistsById(String employeeExistsById) {
		this.employeeExistsById = employeeExistsById;
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

