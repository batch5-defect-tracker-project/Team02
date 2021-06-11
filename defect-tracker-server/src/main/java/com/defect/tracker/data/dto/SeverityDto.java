package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeverityDto {
	private Long id;

	@NotNull(message = "{severityDto.severityName.null}")
	@NotEmpty(message = "{severityDto.severityName.empty}")
	@NotBlank(message = "{severityDto.severityName.blank}")
	private String name;

}