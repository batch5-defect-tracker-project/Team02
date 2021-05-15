package com.defect.tracker.data.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SeverityDto {
	private Long id;
	@NotNull(message = "{severityDto.severityName.null}")
	@NotEmpty(message = "{severityDto.severityName.empty}")
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
