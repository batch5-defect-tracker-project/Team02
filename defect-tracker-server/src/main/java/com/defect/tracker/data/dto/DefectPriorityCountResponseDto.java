package com.defect.tracker.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefectPriorityCountResponseDto {
	private Long priorityHigh;
	private Long priorityMedium;
	private Long priorityLow;
	private Long totalPriority;

}