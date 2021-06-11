package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TypeDto {
	private Long id;

	@NotNull(message = "{typeDto.typeName.null}")
	@NotEmpty(message = "{typeDto.typeName.empty}")
	@NotBlank(message = "{typeDto.typeName.blank}")
	private String name;

}