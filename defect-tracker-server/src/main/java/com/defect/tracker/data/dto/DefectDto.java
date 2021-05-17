package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class DefectDto {
	private Long id;
	private Long moduleId;
	private Long subModuleId;
	private Long typeId;
	private Long severityId;
	private Long priorityId;
	private Long projectId;

	@NotNull(message = "{defectDto.defectDescription.null}")
	@NotEmpty(message = "{defectDto.defectDescription.empty}")
	@NotBlank(message = "{defectDto.defectDescription.blank}")
	private String description;

	@NotNull(message = "{defectDto.defectSteptoReCreate.null}")
	@NotEmpty(message = "{defectDto.defectSteptoReCreate.empty}")
	@NotBlank(message = "{defectDto.defectSteptoReCreate.blank}")
	private String stepToReCreate;

	@NotNull(message = "{defectDto.defectComments.null}")
	@NotEmpty(message = "{defectDto.defectComments.empty}")
	@NotBlank(message = "{defectDto.defectComments.blank}")
	private String comments;
	
	@NotNull(message = "{defectDto.defectAssignedTo.null}")
	@NotEmpty(message = "{defectDto.defectAssignedTo.empty}")
	@NotBlank(message = "{defectDto.defectAssignedTo.blank}")
	private String assignedTo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public Long getSubModuleId() {
		return subModuleId;
	}

	public void setSubModuleId(Long subModuleId) {
		this.subModuleId = subModuleId;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Long getSeverityId() {
		return severityId;
	}

	public void setSeverityId(Long severityId) {
		this.severityId = severityId;
	}

	public Long getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Long priorityId) {
		this.priorityId = priorityId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStepToReCreate() {
		return stepToReCreate;
	}

	public void setStepToReCreate(String stepToReCreate) {
		this.stepToReCreate = stepToReCreate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

}