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
@Table(name = "defect")
public class Defect {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String stepToReCreate;
	private String comments;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "module_id", nullable = false)
	@JsonIgnoreProperties(value = { "defect", "hibernateLazyInitializer" })
	private Module module;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subModule_id", nullable = false)
	@JsonIgnoreProperties(value = { "defect", "hibernateLazyInitializer" })
	private SubModule subModule;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type_id", nullable = false)
	@JsonIgnoreProperties(value = { "defect", "hibernateLazyInitializer" })
	private Type type;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "severity_id", nullable = false)
	@JsonIgnoreProperties(value = { "defect", "hibernateLazyInitializer" })
	private Severity severity;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "priority_id", nullable = false)
	@JsonIgnoreProperties(value = { "defect", "hibernateLazyInitializer" })
	private Priority priority;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id", nullable = false)
	@JsonIgnoreProperties(value = { "defect", "hibernateLazyInitializer" })
	private Project project;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status_id", nullable = false)
	@JsonIgnoreProperties(value = { "defect", "hibernateLazyInitializer" })
	private Status status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assignedBy", nullable = false)
	@JsonIgnoreProperties(value = { "defect", "hibernateLazyInitializer" })
	private Employee assignedBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assignedTo", nullable = false)
	@JsonIgnoreProperties(value = { "defect", "hibernateLazyInitializer" })
	private Employee assignedTo;

}