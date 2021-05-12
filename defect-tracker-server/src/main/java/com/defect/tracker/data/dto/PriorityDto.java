package com.defect.tracker.data.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PriorityDto {

	private Long id;

	@NotNull(message = "{priorityDto.projectName.null}")
	@NotEmpty(message = "{priorityDto.projectName.empty}")
	@NotBlank(message = "{priorityDto.projectName.blank}")
	private String priority;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

}
