package com.defect.tracker.services;

import com.defect.tracker.data.entities.Severity;

public interface SeverityService {

	public boolean isSeverityNameAlreadyExist(String severityName);

	public void createSeverity(Severity severity);

	public Object getSeverityById(Long id);

	public boolean existsById(Long id);

}