package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
	private static final String ID = "/{id}";

	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
	public static final String SEVERITY = BASE_API_PATH + "severity";
	public static final String PROJECT_ALLOCATION = BASE_API_PATH + "projectAllocation";

	public static final String PROJECT_ALLOCATION_BY_ID =  BASE_API_PATH + "projectAllocation"+ID;
	public static final String SEVERITY_BY_ID = BASE_API_PATH + "severity"+ID;

	private EndpointURI() {

	}
}




