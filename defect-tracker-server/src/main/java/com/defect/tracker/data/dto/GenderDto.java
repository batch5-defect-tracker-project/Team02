package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenderDto {
	private Long id;

	@NotNull(message = "{genderDto.genderName.null}")
	@NotEmpty(message = "{genderDto.genderName.empty}")
	@NotBlank(message = "{genderDto.genderName.blank}")
	private String name;

}