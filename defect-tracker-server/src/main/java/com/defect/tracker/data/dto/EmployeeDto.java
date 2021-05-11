package com.defect.tracker.data.dto;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.defect.tracker.data.entities.Gender;

public class EmployeeDto {
	private Long id;
	@NotNull(message = "{employeeDto.employeeName.null}")
	@NotEmpty(message = "{employeeDto.employeeName.empty}")
	private String name;
	@NotNull(message = "{employeeDto.employeeContactNo.null}")
	private int contactNo;
	@NotNull(message = "{employeeDto.employeeEmail.null}")
	@NotEmpty(message = "{employeeDto.employeeEmail.empty}")
	@Email(message = "{employeeDto.employeeEmail.Enter a valid email address}")
	@Size(min = 1, max = 100)
	@Pattern(regexp ="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", message="{employeeDto.employeeEmail.Email address not allowed}")
	private String email;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "gender_id", nullable= false)
	private Gender gender;
	
	
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
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
}
