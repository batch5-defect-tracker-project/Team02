package com.defect.tracker.data.dto;


import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.defect.tracker.data.entities.Employee;



public class GenderDto {
	private Long id;

	@NotNull(message = "{employeeDto.employeeName.null}")
	@NotEmpty(message = "{employeeDto.employeeName.empty}")
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "gender") 
	private Employee employee;
	
	
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
