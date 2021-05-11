package com.defect.tracker.data.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class DesignationDto {
	
	private Long id;
	@NotNull(message = "{designationDto.designationName.null}")
	@NotEmpty(message = "{designationDto.designationName.empty}")
	private String name;
	private Long employeeId;
	
	
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
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	

}
