package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
	private static final String ID = "/{id}";

	
	private static final String ID = "/{id}";
	

	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
    //Module
	private static final String ID = "/{id}";


	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
	public static final String PROJECT_BY_ID = BASE_API_PATH + "project" + ID;



	// Project
	public static final String PROJECT = BASE_API_PATH + "project";

	public static final String PROJECT_ALLOCATER = BASE_API_PATH + "projectAllocator";

	public static final String PROJECT_ALLOCATOR_BY_ID =  BASE_API_PATH + "projectAllocator"+ID;

	public static final String EMPLOYEE = BASE_API_PATH + "employee";
	public static final String EMPLOYEE_BY_ID = BASE_API_PATH + "employee"+ ID;
	public static final String GENDER = BASE_API_PATH + "gender";
	public static final String GENDER_BY_ID = BASE_API_PATH + "gender"+ ID;



	public static final String MODULE = BASE_API_PATH + "module";
   //Designation
	public static final String DESIGNATION = BASE_API_PATH +"designation";

    public static final String MODULE_BY_ID = BASE_API_PATH +"module" + ID;


	public static final String SUBMODULE = BASE_API_PATH +"subModule";


	private EndpointURI() {

	}
}




