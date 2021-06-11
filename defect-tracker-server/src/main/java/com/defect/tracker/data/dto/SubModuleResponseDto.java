package com.defect.tracker.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubModuleResponseDto {
	private Long id;
	private String name;
	private Long moduleId;
	private String moduleName;

}