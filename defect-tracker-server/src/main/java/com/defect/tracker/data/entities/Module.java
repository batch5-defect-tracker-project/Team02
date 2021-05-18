package com.defect.tracker.data.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "module")
public class Module {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id", nullable = false)
	@JsonIgnoreProperties(value = { "module", "hibernateLazyInitializer" })
	private Project project;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy= "module")
	private List <SubModule> subModule;

	public Project getProject() {
		return project;
	}

	public List<SubModule> getSubModule() {
		return subModule;
	}

	public void setSubModule(List<SubModule> subModule) {
		this.subModule = subModule;
	}

	public void setProject(Project project) {
		this.project = project;
	}

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

}
