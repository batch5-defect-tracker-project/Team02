package com.defect.tracker.data.dto;


import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.defect.tracker.data.entities.Employee;



public class GenderDto {
	private Long id;

	@NotNull(message = "{genderDto.genderName.null}")
	@NotEmpty(message = "{genderDto.genderName.empty}")
	private String gender;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "gender") 
	private Employee employee;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	
}
