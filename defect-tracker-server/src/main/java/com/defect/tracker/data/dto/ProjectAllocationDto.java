package com.defect.tracker.data.dto;

import javax.validation.constraints.NotNull;

public class ProjectAllocationDto {
	private Long id;
	@NotNull(message = "{projectAllocatationDto.projectId.null}")
	private Long projectId;
	@NotNull(message = "{projectAllocationDto.EmployeeId.null}")
	private Long employeeId;
	@NotNull(message = "{projectAllocationDto.ModuleId.null}")
	private Long moduleId;
	private Long subModuleId;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getModuleId() {
		return moduleId;
	}

	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}

	public long getSubModuleId() {
		return subModuleId;
	}

	public void setSubModuleId(long subModuleId) {
		this.subModuleId = subModuleId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
