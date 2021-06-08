package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class DesignationDto {
	private Long id;

	@NotNull(message = "{designationDto.designationName.null}")
	@NotEmpty(message = "{designationDto.designationName.empty}")
	@NotBlank(message = "{designationDto.designationName.blank}")
	private String name;

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

}