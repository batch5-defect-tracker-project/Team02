package com.defect.tracker.data.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class LoginDto {

	private Long id;

	@Email(message = "Enter a valid email address.")
	@Pattern(regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_&*-]+)*@(?:[a-zA-Z0-9-]+\\.[a-zA-Z]{2,7}$)", message = "{loginDto.login.emailAddressNotAllowed}")
	private String email;

	@NotNull(message = "{loginDto.password.null}")
	@NotEmpty(message = "{loginDto.password.empty}")
	@NotBlank(message = "{loginDto.password.blank}")
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}