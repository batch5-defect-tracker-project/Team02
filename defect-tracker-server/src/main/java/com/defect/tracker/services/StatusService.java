package com.defect.tracker.services;

import java.util.Optional;

import com.defect.tracker.data.entities.Status;

public interface StatusService {

	public void createStatus(Status status);

	public boolean isStatusNameAlreadyExist(String statusName);

	public boolean existsById(Long id);

	public Object getStatusById(Long id);

	public Optional<Status> findById(Long id);
	
	public Status findByName(String statusName);

}