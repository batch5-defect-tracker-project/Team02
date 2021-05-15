package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
	private static final String ID = "/{id}";
	
	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
	public static final String PROJECT_BY_ID = BASE_API_PATH + "project" + ID;


	//Project Allocation
	public static final String PROJECT_ALLOCATER = BASE_API_PATH + "projectAllocator";
	public static final String PROJECT_ALLOCATOR_BY_ID =  BASE_API_PATH + "projectAllocator"+ID;

	//Employee
	public static final String EMPLOYEE = BASE_API_PATH + "employee";
	public static final String EMPLOYEE_BY_ID = BASE_API_PATH + "employee"+ ID;

	//Gender
	public static final String GENDER = BASE_API_PATH + "gender";
	public static final String GENDER_BY_ID = BASE_API_PATH + "gender"+ ID;
	
	//Designation
	public static final String DESIGNATION = BASE_API_PATH +"designation";
	
	//Module
	public static final String MODULE = BASE_API_PATH + "module";
	public static final String MODULE_BY_ID = BASE_API_PATH +"module" + ID;
	
	//SubModule
   	public static final String SUBMODULE = BASE_API_PATH +"subModule";
    public static final String SUBMODULE_BY_ID = BASE_API_PATH +"submodule" + ID;

	private EndpointURI() {

	}
}




