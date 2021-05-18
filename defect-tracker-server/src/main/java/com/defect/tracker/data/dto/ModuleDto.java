package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ModuleDto {
	private Long id;
	@NotNull(message = "{moduleDto.moduleName.null}")
	@NotEmpty(message = "{moduleDto.moduleName.empty}")
	@NotBlank(message = "{moduleDto.moduleName.blank}")
	private String name;
	@NotNull(message = "{moduleDto.projectId.null}")
	private Long projectId;

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

}
