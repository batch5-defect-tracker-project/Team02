package com.defect.tracker.services;

import java.util.Optional;

import com.defect.tracker.data.entities.Priority;

public interface PriorityService {

	public void createPriority(Priority priority);

	public boolean isPriorityAlreadyExist(String priorityName);

	public boolean existsById(Long id);

	public Object getPriorityById(Long id);
	
	public Optional<Priority> findById(Long id);

}
