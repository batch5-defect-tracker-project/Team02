package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModuleDto {
	private Long id;

	@NotNull(message = "{moduleDto.moduleName.null}")
	@NotEmpty(message = "{moduleDto.moduleName.empty}")
	@NotBlank(message = "{moduleDto.moduleName.blank}")
	private String name;

	@NotNull(message = "{moduleDto.projectId.null}")
	private Long projectId;

}