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
	// Login
	public static final String LOGIN = BASE_API_PATH + "login";
	// Priority
	public static final String PRIORITY = BASE_API_PATH + "priority";
	public static final String PRIORITY_BY_ID = BASE_API_PATH + "priority" + ID;

	private EndpointURI() {

	}
}
