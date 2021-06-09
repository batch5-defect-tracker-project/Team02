package com.defect.tracker.data.dto;

public class ModuleResponseDto {
	private Long id;
	private String name;
	private Long projectId;
	private String projectName;
	private String projectAbbreviation;

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

	public String getProjectAbbreviation() {
		return projectAbbreviation;
	}

	public void setProjectAbbreviation(String projectAbbreviation) {
		this.projectAbbreviation = projectAbbreviation;
	}

}