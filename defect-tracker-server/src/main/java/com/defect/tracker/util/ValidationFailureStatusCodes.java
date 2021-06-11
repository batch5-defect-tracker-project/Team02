package com.defect.tracker.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * contains custom error messages
 *
 */

@Getter
@Setter
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

}