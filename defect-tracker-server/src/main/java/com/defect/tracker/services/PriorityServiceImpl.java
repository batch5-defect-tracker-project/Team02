package com.defect.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Priority;
import com.defect.tracker.data.repositories.PriorityReposistory;

@Service
public class PriorityServiceImpl implements PriorityService {
	@Autowired
	PriorityReposistory priorityReposistory;

	@Override
	public void createPriority(Priority priority) {
		priorityReposistory.save(priority);
	}

	@Override
	public boolean isPriorityAlreadyExist(String priorityName) {
		return priorityReposistory.existsByName(priorityName);
	}

	@Override
	public boolean existsById(Long id) {
		return priorityReposistory.existsById(id);
	}

	@Override
	public Object getPriorityById(Long id) {
		return priorityReposistory.findById(id);
	}

}