package com.defect.tracker.data.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "projectAllocation")
public class ProjectAllocation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id", nullable = false)
	@JsonIgnoreProperties(value = { "projectAllocation", "hibernateLazyInitializer" })
	private Project project;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id", nullable = false)
	@JsonIgnoreProperties(value = { "projectAllocation", "hibernateLazyInitializer" })
	private Employee employee;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "module_id", nullable = false)
	@JsonIgnoreProperties(value = { "projectAllocation", "hibernateLazyInitializer" })
	private Module module;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subModule_id", nullable = false)
	@JsonIgnoreProperties(value = { "projectAllocation", "hibernateLazyInitializer" })
	private SubModule subModule;

}