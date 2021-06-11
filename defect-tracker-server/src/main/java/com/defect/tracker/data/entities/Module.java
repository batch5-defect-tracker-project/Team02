package com.defect.tracker.data.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "module")
public class Module {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id", nullable = false)
	@JsonIgnoreProperties(value = { "module", "hibernateLazyInitializer" })
	private Project project;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "module")
	@JsonIgnoreProperties(value = { "module", "hibernateLazyInitializer" })
	private List<SubModule> subModule;

}