package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
	private static final String ID = "/{id}";
	private static final String PROJECTNAME = "/{projectName}";

	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
	public static final String PROJECT_BY_ID = BASE_API_PATH + "project" + ID;

	// Employee
	public static final String EMPLOYEE_REGISTER = BASE_API_PATH + "employee-register";
	public static final String EMPLOYEE = BASE_API_PATH + "employee";
	public static final String EMPLOYEE_BY_ID = BASE_API_PATH + "employee" + ID;
	public static final String EMPLOYEE_VERIFY = BASE_API_PATH + "verify";

	// Gender
	public static final String GENDER = BASE_API_PATH + "gender";
	public static final String GENDER_BY_ID = BASE_API_PATH + "gender" + ID;

	// Designation
	public static final String DESIGNATION = BASE_API_PATH + "designation";
	public static final String DESIGNATION_BY_ID = BASE_API_PATH + "designation" + ID;

	// Login
	public static final String LOGIN = BASE_API_PATH + "login";

	// Module
	public static final String MODULE = BASE_API_PATH + "module";
	public static final String MODULE_BY_ID = BASE_API_PATH + "module" + ID;

	// SubModule
	public static final String SUBMODULE = BASE_API_PATH + "subModule";
	public static final String SUBMODULE_BY_ID = BASE_API_PATH + "subModule" + ID;

	// Defect
	public static final String DEFECT = BASE_API_PATH + "defect";
	public static final String DEFECT_BY_ID = BASE_API_PATH + "defect" + ID;
	public static final String COUNT_PRIORITY = BASE_API_PATH + "count-priority" + PROJECTNAME;
	public static final String COUNT_STATUS = BASE_API_PATH + "count-status" + PROJECTNAME;
		
	// Project Allocation
	public static final String PROJECT_ALLOCATION = BASE_API_PATH + "projectAllocation";
	public static final String PROJECT_ALLOCATION_BY_ID = BASE_API_PATH + "projectAllocation" + ID;

	// Type
	public static final String TYPE = BASE_API_PATH + "type";
	public static final String TYPE_BY_ID = BASE_API_PATH + "type" + ID;

	// Severity
	public static final String SEVERITY_BY_ID = BASE_API_PATH + "severity" + ID;
	public static final String SEVERITY = BASE_API_PATH + "severity";

	// Priority
	public static final String PRIORITY = BASE_API_PATH + "priority";
	public static final String PRIORITY_BY_ID = BASE_API_PATH + "priority" + ID;

	// Status
	public static final String STATUS = BASE_API_PATH + "status";
	public static final String STATUS_BY_ID = BASE_API_PATH + "status" + ID;

	private EndpointURI() {
		
	}

}