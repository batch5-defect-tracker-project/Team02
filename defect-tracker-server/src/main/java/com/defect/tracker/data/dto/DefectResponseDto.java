package com.defect.tracker.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefectResponseDto {
	private Long id;
	private Long moduleId;
	private String moduleName;
	private Long subModuleId;
	private String subModuleName;
	private Long typeId;
	private String typeName;
	private Long severityId;
	private String severityName;
	private Long priorityId;
	private String priorityName;
	private Long projectId;
	private String projectName;
	private String description;
	private String stepToReCreate;
	private String comments;
	private Long assignedToId;
	private Long assignedById;
	private Long statusId;
	private String statusName;

}