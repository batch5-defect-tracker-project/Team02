package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class StatusDto {
	private Long id;

	@NotNull(message = "{statusDto.statusName.null}")
	@NotEmpty(message = "{statusDto.statusName.empty}")
	@NotBlank(message = "{statusDto.statusName.blank}")
	@Pattern(regexp = "^[a-zA-Z.\\-\\/+=@_ ]*$", message = "{statusDto.statusName.notAllowSpecialCharacters}")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}