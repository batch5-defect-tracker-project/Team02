package com.defect.tracker.data.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeResponseDto {
	private Long id;
	private String name;
	private int contactNo;
	private String email;
	private String password;
	private String verificationCode;
	private boolean isEnabled;
	private Long genderId;
	private String genderName;
	private Long designationId;
	private String designationName;

}