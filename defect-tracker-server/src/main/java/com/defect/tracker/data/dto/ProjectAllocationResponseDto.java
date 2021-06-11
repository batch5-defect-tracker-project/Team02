package com.defect.tracker.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectAllocationResponseDto {
	private Long id;
	private Long projectId;
	private String projectName;
	private Long employeeId;
	private String employeeName;
	private Long moduleId;
	private String moduleName;
	private Long subModuleId;
	private String subModuleName;

}