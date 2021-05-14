package com.defect.tracker.data.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeDto {
	private Long id;
	@NotNull(message = "{employeeDto.employeeName.null}")
	@NotEmpty(message = "{employeeDto.employeeName.empty}")
	@NotBlank(message = "{employeeDto.employeeName.blank}")
	private String name;
	@NotNull(message = "{employeeDto.employeeContactNo.null}")
	private int contactNo;
	@NotNull(message = "{employeeDto.employeeEmail.null}")
	@NotEmpty(message = "{employeeDto.employeeEmail.empty}")
	@Email(message = "{employeeDto.employeeEmail.EnterAValidEmailAddress}")
	@Size(min = 1, max = 100)
	@Pattern(regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", message = "{employeeDto.employeeEmail.EmailAddressNotAllowed}")
	private String email;
	private Long genderId;

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

	public Long getGenderId() {
		return genderId;
	}

	public void setGenderId(Long genderId) {
		this.genderId = genderId;
	}

}
