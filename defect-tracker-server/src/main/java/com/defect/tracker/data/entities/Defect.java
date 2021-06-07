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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStepToReCreate() {
		return stepToReCreate;
	}

	public void setStepToReCreate(String stepToReCreate) {
		this.stepToReCreate = stepToReCreate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public SubModule getSubModule() {
		return subModule;
	}

	public void setSubModule(SubModule subModule) {
		this.subModule = subModule;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Employee getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(Employee assignedBy) {
		this.assignedBy = assignedBy;
	}

	public Employee getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(Employee assignedTo) {
		this.assignedTo = assignedTo;
	}
	
}