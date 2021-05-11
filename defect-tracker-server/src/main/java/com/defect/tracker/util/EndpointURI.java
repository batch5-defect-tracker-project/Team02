package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";

	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
    //Module
	public static final String MODULE = BASE_API_PATH + "module";
   //Designation
	public static final String DESIGNATION = BASE_API_PATH +"designation";

	private EndpointURI() {

	}
}
