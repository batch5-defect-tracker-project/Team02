package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.ProjectAllocator;

public interface ProjectAllocatorService {

	public boolean isEmployeeIdAlreadyExist(Long EmployeeId);

	public void createProjectAllocator(ProjectAllocator projectAllocator);

	public List<ProjectAllocator> getAllProjectAllocator();
	
	public void updateProjectAllocator(ProjectAllocator projectAllocator);
	
	public boolean existsById(Long id);
	
	public void deleteById(Long id);
	
	public Object getProjectAllocatorById(Long id);
}
