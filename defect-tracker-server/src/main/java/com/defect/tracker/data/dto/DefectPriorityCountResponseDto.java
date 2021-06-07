package com.defect.tracker.data.dto;

public class DefectPriorityCountResponseDto {
	private Long priorityHigh;
	private Long priorityMedium;
	private Long priorityLaw;
	private Long totalPriority;

	public Long getPriorityHigh() {
		return priorityHigh;
	}

	public void setPriorityHigh(Long priorityHigh) {
		this.priorityHigh = priorityHigh;
	}

	public Long getPriorityMedium() {
		return priorityMedium;
	}

	public void setPriorityMedium(Long priorityMedium) {
		this.priorityMedium = priorityMedium;
	}

	public Long getPriorityLaw() {
		return priorityLaw;
	}

	public void setPriorityLaw(Long priorityLaw) {
		this.priorityLaw = priorityLaw;
	}

	public Long getTotalPriority() {
		return totalPriority;
	}

	public void setTotalPriority(Long totalPriority) {
		this.totalPriority = totalPriority;
	}

}
