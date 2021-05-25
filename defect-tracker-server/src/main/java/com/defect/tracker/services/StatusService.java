package com.defect.tracker.services;

import com.defect.tracker.data.entities.Status;

public interface StatusService {

	void createStatus(Status status);

	boolean isStatusNameAlreadyExist(String name);

	boolean existsById(Long id);

	public Object getStatusById(Long id);

} 
