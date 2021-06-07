package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class DefectDto {
	private Long id;

	@NotNull(message = "{defectDto.moduleId.null}")
	private Long moduleId;

	@NotNull(message = "{defectDto.subModuleId.null}")
	private Long subModuleId;

	@NotNull(message = "{defectDto.typeId.null}")
	private Long typeId;

	@NotNull(message = "{defectDto.severityId.null}")
	private Long severityId;

	@NotNull(message = "{defectDto.priorityId.null}")
	private Long priorityId;

	@NotNull(message = "{defectDto.projectId.null}")
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

	@NotNull(message = "{defectDto.defectAssignedToId.null}")
	private Long assignedToId;

	@NotNull(message = "{defectDto.defectAssignedById.null}")
	private Long assignedById;

	@NotNull(message = "{defectDto.defectStatusId.null}")
	private Long statusId;

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

	public Long getAssignedToId() {
		return assignedToId;
	}

	public void setAssignedToId(Long assignedToId) {
		this.assignedToId = assignedToId;
	}

	public Long getAssignedById() {
		return assignedById;
	}

	public void setAssignedById(Long assignedById) {
		this.assignedById = assignedById;
	}

	public Long getStatusId() {
		return statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
	}

}