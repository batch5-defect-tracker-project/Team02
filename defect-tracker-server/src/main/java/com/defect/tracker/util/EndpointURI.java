package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
	
	private static final String ID = "/{id}";
	

	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
    //Module
	public static final String MODULE = BASE_API_PATH + "module";
   //Designation
	public static final String DESIGNATION = BASE_API_PATH +"designation";

    public static final String MODULE_BY_ID = BASE_API_PATH +"module" + ID;


	private EndpointURI() {

	}
}
