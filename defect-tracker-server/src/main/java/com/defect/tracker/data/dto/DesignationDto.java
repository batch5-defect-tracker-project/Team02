package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DesignationDto {
	private Long id;

	@NotNull(message = "{designationDto.designationName.null}")
	@NotEmpty(message = "{designationDto.designationName.empty}")
	@NotBlank(message = "{designationDto.designationName.blank}")
	private String name;

}