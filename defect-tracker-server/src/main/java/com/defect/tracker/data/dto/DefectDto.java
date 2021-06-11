package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefectDto {
	private Long id;

	@NotNull(message = "{defectDto.moduleId.null}")
	private Long moduleId;

	@NotNull(message = "{defectDto.subModuleId.null}")
	private Long subModuleId;

	@NotNull(message = "{defectDto.typeId.null}")
	private Long typeId;

	@NotNull(message = "{defectDto.severityId.null}")
	private Long severityId;

	@NotNull(message = "{defectDto.priorityId.null}")
	private Long priorityId;

	@NotNull(message = "{defectDto.projectId.null}")
	private Long projectId;

	@NotNull(message = "{defectDto.defectDescription.null}")
	@NotEmpty(message = "{defectDto.defectDescription.empty}")
	@NotBlank(message = "{defectDto.defectDescription.blank}")
	private String description;

	@NotNull(message = "{defectDto.defectSteptoReCreate.null}")
	@NotEmpty(message = "{defectDto.defectSteptoReCreate.empty}")
	@NotBlank(message = "{defectDto.defectSteptoReCreate.blank}")
	private String stepToReCreate;

	@NotNull(message = "{defectDto.defectComments.null}")
	@NotEmpty(message = "{defectDto.defectComments.empty}")
	@NotBlank(message = "{defectDto.defectComments.blank}")
	private String comments;

	@NotNull(message = "{defectDto.defectAssignedToId.null}")
	private Long assignedToId;

	@NotNull(message = "{defectDto.defectAssignedById.null}")
	private Long assignedById;

	@NotNull(message = "{defectDto.defectStatusId.null}")
	private Long statusId;

}