package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PriorityDto {
	private Long id;

	@NotNull(message = "{priorityDto.priorityName.null}")
	@NotEmpty(message = "{priorityDto.priorityName.empty}")
	@NotBlank(message = "{priorityDto.priorityName.blank}")
	private String name;

}