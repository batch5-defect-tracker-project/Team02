package com.defect.tracker.data.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {
	private Long id;

	@NotNull(message = "{loginDto.login.null}")
	@Email(message = "{loginDto.login.EnterAValidEmailAddress}")
	@Pattern(regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_&*-]+)*@(?:[a-zA-Z0-9-]+\\.[a-zA-Z]{2,7}$)", message = "{loginDto.login.emailAddressNotAllowed}")
	private String email;

	@NotNull(message = "{loginDto.password.null}")
	@NotEmpty(message = "{loginDto.password.empty}")
	@NotBlank(message = "{loginDto.password.blank}")
	private String password;

}