package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ProjectDto {
	private Long id;

	@NotNull(message = "{projectDto.projectName.null}")
	@NotEmpty(message = "{projectDto.projectName.empty}")
	@NotBlank(message = "{projectDto.projectName.blank}")
	private String name;

	@NotNull(message = "{projectDto.projectAbbreviation.null}")
	@NotEmpty(message = "{projectDto.projectAbbreviation.empty}")
	@NotBlank(message = "{projectDto.projectAbbreviation.blank}")
	private String abbreviation;

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

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

}