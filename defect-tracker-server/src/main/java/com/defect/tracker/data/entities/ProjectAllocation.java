package com.defect.tracker.data.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projectAllocation")
public class ProjectAllocation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long projectId;
	private Long employeeId;
	private Long moduleId;
	private Long subModuleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getModuleId() {
		return moduleId;
	}

	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}

	public long getSubmoduleId() {
		return subModuleId;
	}

	public void setSubmoduleId(long submoduleId) {
		this.subModuleId = submoduleId;
	}

}
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "projectallocation")
	public class ProjectAllocation {
		
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long id;
			private Long projectId;
			private Long employeeId;
			private Long moduleId;
			private Long subModuleId;
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public Long getProjectId() {
				return projectId;
			}
			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}
			public long getEmployeeId() {
				return employeeId;
			}
			public void setEmployeeId(long employeeId) {
				this.employeeId = employeeId;
			}
			public long getModuleId() {
				return moduleId;
			}
			public void setModuleId(long moduleId) {
				this.moduleId = moduleId;
			}
			public long getSubmoduleId() {
				return subModuleId;
			}
			public void setSubmoduleId(long submoduleId) {
				this.subModuleId = submoduleId;
			}
			
			
			


	}
