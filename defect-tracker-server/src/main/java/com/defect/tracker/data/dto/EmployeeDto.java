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
	@NotEmpty(message = "{employeeDto.employeeContactNo.empty}")
	@NotBlank(message = "{employeeDto.employeeContactNo.blank}")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "{employeeDto.employeeContactNo.EnterValidPhoneNo}")
	private String contactNo;

	@NotNull(message = "{employeeDto.employeeEmail.null}")
	@NotEmpty(message = "{employeeDto.employeeEmail.empty}")
	@Email(message = "{employeeDto.employeeEmail.EnterAValidEmailAddress}")
	@Size(min = 1, max = 100)
	@Pattern(regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", message = "{employeeDto.employeeEmail.EmailAddressNotAllowed}")
	private String email;

	@NotNull(message = "{employeeDto.genderId.null}")
	private Long genderId;

	@NotNull(message = "{employeeDto.designationId.null}")
	private Long designationId;

	@NotNull(message = "{employeeDto.password.null}")
	private String password;

	private String verificationCode;
	private boolean isEnabled;

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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
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

	public Long getDesignationId() {
		return designationId;
	}

	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

}