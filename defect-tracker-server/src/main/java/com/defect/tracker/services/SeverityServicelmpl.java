package com.defect.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Severity;
import com.defect.tracker.data.repositories.SeverityRepository;

@Service
public class SeverityServicelmpl implements SeverityService {
	@Autowired
	private SeverityRepository severityRepository;

	@Override
	public boolean isSeverityNameAlreadyExist(String severityName) {
		return severityRepository.existsByName(severityName);
	}

	@Override
	public void createSeverity(Severity severity) {
		severityRepository.save(severity);
	}

	@Override
	public Object getSeverityById(Long id) {
		return severityRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return severityRepository.existsById(id);
	}

}