package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubModuleDto {
	private Long id;

	@NotNull(message = "{subModuleDto.subModuleName.null}")
	@NotEmpty(message = "{subModuleDto.subModuleName.empty}")
	@NotBlank(message = "{subModuleDto.subModuleName.blank}")
	private String name;

	@NotNull(message = "{subModuleDto.moduleId.null}")
	private Long moduleId;

}