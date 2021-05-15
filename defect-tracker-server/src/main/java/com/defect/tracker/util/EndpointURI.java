package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
	private static final String ID = "/{id}";

	// Severity
	public static final String SEVERITY_BY_ID = BASE_API_PATH + "severity" + ID;
	public static final String SEVERITY = BASE_API_PATH + "severity";

	// Type
	public static final String TYPE = BASE_API_PATH + "type";
	public static final String TYPE_BY_ID = BASE_API_PATH + "type" + ID;

	// Defect
	public static final String DEFECT = BASE_API_PATH + "defect";
	public static final String DEFECT_BY_ID = BASE_API_PATH + "defect" + ID;

	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
	public static final String PROJECT_BY_ID = BASE_API_PATH + "project" + ID;

	// Project Allocation
	public static final String PROJECT_ALLOCATION = BASE_API_PATH + "projectAllocation";
	public static final String PROJECT_ALLOCATION_BY_ID = BASE_API_PATH + "projectAllocation" + ID;


	// Employee
	public static final String EMPLOYEE = BASE_API_PATH + "employee";
	public static final String EMPLOYEE_BY_ID = BASE_API_PATH + "employee" + ID;

	// Gender
	public static final String GENDER = BASE_API_PATH + "gender";
	public static final String GENDER_BY_ID = BASE_API_PATH + "gender" + ID;

	// Project Allocation
	public static final String PROJECT_ALLOCATION = BASE_API_PATH + "projectAllocation";
	public static final String PROJECT_ALLOCATION_BY_ID = BASE_API_PATH + "projectAllocation" + ID;

	// Designation
	public static final String DESIGNATION = BASE_API_PATH + "designation";
	public static final String DESIGNATION_BY_ID = BASE_API_PATH + "designation" + ID;


	// Module
	public static final String MODULE = BASE_API_PATH + "module";
	public static final String MODULE_BY_ID = BASE_API_PATH + "module" + ID;

	// SubModule
	public static final String SUBMODULE = BASE_API_PATH + "subModule";
	public static final String SUBMODULE_BY_ID = BASE_API_PATH + "subModule" + ID;

	// Login
	public static final String LOGIN = BASE_API_PATH + "login";

	// priority
	public static final String PRIORITY = BASE_API_PATH + "priority";
	public static final String PRIORITY_BY_ID = BASE_API_PATH + "priority" + ID;


	private EndpointURI() {

	}
}
