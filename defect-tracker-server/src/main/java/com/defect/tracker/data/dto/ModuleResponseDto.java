package com.defect.tracker.data.dto;

public class ModuleResponseDto {
	private Long id;
	private String name;
	private Long projectId;
	private String projectName;
	private String projectAbbrevation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectAbbrevation() {
		return projectAbbrevation;
	}

	public void setProjectAbbrevation(String projectAbbrevation) {
		this.projectAbbrevation = projectAbbrevation;
	}

}