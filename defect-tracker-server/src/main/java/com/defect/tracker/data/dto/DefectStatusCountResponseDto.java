package com.defect.tracker.data.dto;

public class DefectStatusCountResponseDto {
	private Long statusNew;
	private Long statusOpen;
	private Long statusReopen;
	private Long statusClosed;
	private Long statusFixed;
	private Long statusReject;
	private Long total;

	public Long getStatusNew() {
		return statusNew;
	}

	public void setStatusNew(Long statusNew) {
		this.statusNew = statusNew;
	}

	public Long getStatusOpen() {
		return statusOpen;
	}

	public void setStatusOpen(Long statusOpen) {
		this.statusOpen = statusOpen;
	}

	public Long getStatusReopen() {
		return statusReopen;
	}

	public void setStatusReopen(Long statusReopen) {
		this.statusReopen = statusReopen;
	}

	public Long getStatusClosed() {
		return statusClosed;
	}

	public void setStatusClosed(Long statusClosed) {
		this.statusClosed = statusClosed;
	}

	public Long getStatusFixed() {
		return statusFixed;
	}

	public void setStatusFixed(Long statusFixed) {
		this.statusFixed = statusFixed;
	}

	public Long getStatusReject() {
		return statusReject;
	}

	public void setStatusReject(Long statusReject) {
		this.statusReject = statusReject;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

}
