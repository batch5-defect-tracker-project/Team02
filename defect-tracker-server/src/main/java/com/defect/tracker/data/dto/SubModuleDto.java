package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SubModuleDto {
	private Long id;
	@NotNull(message = "{subModuleDto.subModuleName.null}")
	@NotEmpty(message = "{subModuleDto.subModuleName.empty}")
	@NotBlank(message = "{subModuleDto.subModuleName.blank}")
	private String name;
	private Long moduleId;
	

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

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

}
