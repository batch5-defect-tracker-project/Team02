package com.defect.tracker.util;

public class ValidationConstance {

	// Project
	public static final String PROJECT_EXISTS = "Project Already Exists";
	public static final String PROJECT_NOT_EXISTS_BY_ID = "Project Id Not Exists";
	public static final String PROJECT_NOT_EXISTS_BY_NAME = "Project Name Not Exists";

	// Employee
	public static final String EMPLOYEE_EXISTS = "Employee Already Exists";
	public static final String EMPLOYEE_NOT_EXISTS_BY_ID = "Employee Id Not Exists";
	public static final String EMPLOYEE_NOT_REGISTER = "Please Register First OR/ Enter Correct Email Or Password";

	// Gender
	public static final String GENDER_EXISTS = "Gender Already Exists";
	public static final String GENDER_NOT_EXISTS_BY_ID = "Gender Id Not Exists";

	// Designation
	public static final String DESIGNATION_EXISTS = "Designation Already Exists";
	public static final String DESIGNATION_NOT_EXISTS_BY_ID = "Designation Id Not Exists";

	// Module
	public static final String MODULE_EXISTS = "Module Already Exists";
	public static final String MODULE_NOT_EXISTS_BY_ID = "Module Id Not Exists";
	public static final String MODULE_PROJECT_NOT_MATCH = "Module And Project Not Match";

	// SubModule
	public static final String SUBMODULE_EXISTS = "SubModule Already Exists";
	public static final String SUBMODULE_NOT_EXISTS_BY_ID = "SubModule Id Not Exists";
	public static final String SUBMODULE_MODULE_NOT_MATCH = "SubModule And Module Not Match";

	// Defect
	public static final String DEFECT_EXISTS = "Defect Already Exists";
	public static final String DEFECT_NOT_EXISTS_BY_ID = "Defect Id Not Exists";
	public static final String DEFECT_STATUS_NEW_ONLY = "Status New Only";
	public static final String ASSIGNEDTO_ASSIGNEDBY_NOT_EXISTS_BY_ID = "AssignedTo Id OR/ AssignedBy Id Not Exists";
	
	// Project Allocation
	public static final String PROJECT_ALLOCATION_EXISTS = "ProjectAllocation Already Exists";
	public static final String PROJECT_ALLOCATION_NOT_EXISTS_BY_ID = "ProjectAllocation Id Not Exists";

	// Type
	public static final String TYPE_EXISTS = "Type Already Exists";
	public static final String TYPE_NOT_EXISTS_BY_ID = "Type Id Not Exists";

	// Severity
	public static final String SEVERITY_EXISTS = "Severity Already Exists";
	public static final String SEVERITY_NOT_EXISTS_BY_ID = "Severity Id Not Exists";

	// Priority
	public static final String PRIORITY_EXISTS = "Priority Already Exists";
	public static final String PRIORITY_NOT_EXISTS_BY_ID = "Priority Id Not Exists";

	// Status
	public static final String STATUS_EXISTS = "Status Already Exists";
	public static final String STATUS_NOT_EXISTS_BY_ID = "Status Id Not Exists";

	private ValidationConstance() {
	}
}