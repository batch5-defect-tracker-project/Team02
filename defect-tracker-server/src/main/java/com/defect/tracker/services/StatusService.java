package com.defect.tracker.services;

import java.util.Optional;

import com.defect.tracker.data.entities.Status;

public interface StatusService {

	void createStatus(Status status);

	boolean isStatusNameAlreadyExist(String name);

	boolean existsById(Long id);

	public Object getStatusById(Long id);

	public Optional<Status> findById(Long id);

}
