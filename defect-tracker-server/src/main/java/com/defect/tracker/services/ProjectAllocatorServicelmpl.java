package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.ProjectAllocator;
import com.defect.tracker.data.repositories.ProjectAllocatorRepository;

@Service
public class ProjectAllocatorServicelmpl implements ProjectAllocatorService {

	@Autowired
	private ProjectAllocatorRepository projectAllocatorRepository;

	@Override
	public boolean isEmployeeIdAlreadyExist(Long EmployeeId) {

		return projectAllocatorRepository.existsById(EmployeeId);
	}

	@Override
	public void createProjectAllocator(ProjectAllocator projectAllocator) {
		projectAllocatorRepository.save(projectAllocator);
	}

	@Override
	public List<ProjectAllocator> getAllProjectAllocator() {
		return projectAllocatorRepository.findAll();
	}

	@Override
	public void updateProjectAllocator(ProjectAllocator projectAllocator) {
		projectAllocatorRepository.save(projectAllocator);
	}

	@Override
	public boolean existsById(Long id) {
		return projectAllocatorRepository.existsById(id);
	}

	@Override
	public void deleteById(Long id) {
		projectAllocatorRepository.deleteById(id);
	}

	@Override
	public Object getProjectAllocatorById(Long id) {
		return projectAllocatorRepository.findById(id);
	}

}
