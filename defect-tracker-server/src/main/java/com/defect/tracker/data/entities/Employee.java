package com.defect.tracker.data.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int contactNo;
	private String email;
	private String password;
	private String verificationCode;
	private boolean isEnabled;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gender_id", nullable = false)
	@JsonIgnoreProperties(value = { "employee", "hibernateLazyInitializer" })
	private Gender gender;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "designation_id", nullable = false)
	@JsonIgnoreProperties(value = { "employee", "hibernateLazyInitializer" })
	private Designation designation;

}