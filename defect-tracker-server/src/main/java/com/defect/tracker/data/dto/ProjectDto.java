package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectDto {
	private Long id;

	@NotNull(message = "{projectDto.projectName.null}")
	@NotEmpty(message = "{projectDto.projectName.empty}")
	@NotBlank(message = "{projectDto.projectName.blank}")
	private String name;

	@NotNull(message = "{projectDto.projectAbbreviation.null}")
	private String abbreviation;

}