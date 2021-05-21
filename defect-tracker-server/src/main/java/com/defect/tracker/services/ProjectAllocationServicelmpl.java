package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.ProjectAllocation;
import com.defect.tracker.data.repositories.ProjectAllocationRepository;

@Service
public class ProjectAllocationServicelmpl implements ProjectAllocationService {

	@Autowired
	private ProjectAllocationRepository projectAllocationRepository;

	@Override
	public void createProjectAllocation(ProjectAllocation projectAllocation) {
		projectAllocationRepository.save(projectAllocation);
	}

	@Override
	public List<ProjectAllocation> getAllProjectAllocation() {
		return projectAllocationRepository.findAll();
	}

	@Override
	public void updateProjectAllocation(ProjectAllocation projectAllocation) {
		projectAllocationRepository.save(projectAllocation);
	}

	@Override
	public boolean existsById(Long id) {
		return projectAllocationRepository.existsById(id);
	}

	@Override
	public void deleteById(Long id) {
		projectAllocationRepository.deleteById(id);
	}

	@Override
	public Object getProjectAllocationById(Long id) {
		return projectAllocationRepository.findById(id);
	}

}