package com.defect.tracker.data.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectAllocationDto {
	private Long id;

	@NotNull(message = "{projectAllocatationDto.projectId.null}")
	private Long projectId;

	@NotNull(message = "{projectAllocationDto.employeeId.null}")
	private Long employeeId;

	@NotNull(message = "{projectAllocationDto.moduleId.null}")
	private Long moduleId;

	@NotNull(message = "{projectAllocationDto.subModuleId.null}")
	private Long subModuleId;

}