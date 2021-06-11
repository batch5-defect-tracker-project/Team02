package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusDto {
	private Long id;

	@NotNull(message = "{statusDto.statusName.null}")
	@NotEmpty(message = "{statusDto.statusName.empty}")
	@NotBlank(message = "{statusDto.statusName.blank}")
	private String name;

}