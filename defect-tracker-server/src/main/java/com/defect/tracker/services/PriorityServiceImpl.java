package com.defect.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Priority;
import com.defect.tracker.data.repositories.PriorityRepository;

@Service
public class PriorityServiceImpl implements PriorityService {
	@Autowired
	PriorityRepository priorityRepository;

	@Override
	public void createPriority(Priority priority) {
		priorityRepository.save(priority);
	}

	@Override
	public boolean isPriorityAlreadyExist(String priorityName) {
		return priorityRepository.existsByName(priorityName);
	}

	@Override
	public boolean existsById(Long id) {
		return priorityRepository.existsById(id);
	}

	@Override
	public Object getPriorityById(Long id) {
		return priorityRepository.findById(id);
	}

	@Override
	public Priority findByName(String priorityName) {
		return priorityRepository.findByName(priorityName);
	}

}