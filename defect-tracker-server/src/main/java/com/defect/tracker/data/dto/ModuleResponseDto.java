package com.defect.tracker.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModuleResponseDto {
	private Long id;
	private String name;
	private Long projectId;
	private String projectName;
	private String projectAbbreviation;

}