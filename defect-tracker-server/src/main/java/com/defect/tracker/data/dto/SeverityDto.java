package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class SeverityDto {
	private Long id;

	@NotNull(message = "{severityDto.severityName.null}")
	@NotEmpty(message = "{severityDto.severityName.empty}")
	@NotBlank(message = "{severityDto.severityName.blank}")
	@Pattern(regexp = "^[a-zA-Z.\\-\\/+=@_ ]*$", message = "{severityDto.severityName.notAllowSpecialCharacters}")
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