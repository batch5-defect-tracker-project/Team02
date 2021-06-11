package com.defect.tracker.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DefectStatusCountResponseDto {
	private Long statusNew;
	private Long statusOpen;
	private Long statusReopen;
	private Long statusClosed;
	private Long statusFixed;
	private Long statusReject;
	private Long total;

}
