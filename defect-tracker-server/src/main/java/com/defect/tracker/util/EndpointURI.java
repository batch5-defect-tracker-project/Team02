package com.defect.tracker.util;

/**
 * Contains all the rest endpoint url constants
 */
public final class EndpointURI {

	private static final String BASE_API_PATH = "/api/v1/";
	private static final String ID = "/{id}";


	// Project
	public static final String PROJECT = BASE_API_PATH + "project";
	public static final String EMPLOYEE = BASE_API_PATH + "employee";
	public static final String EMPLOYEE_BY_ID = BASE_API_PATH + "employee"+ ID;
	public static final String GENDER = BASE_API_PATH + "gender";

	private EndpointURI() {

	}
}
