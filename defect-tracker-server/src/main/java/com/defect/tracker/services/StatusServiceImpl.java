package com.defect.tracker.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Status;
import com.defect.tracker.data.repositories.StatusRepository;

@Service
public class StatusServiceImpl implements StatusService {
	@Autowired
	private StatusRepository statusRepository;

	@Override
	public boolean isStatusNameAlreadyExist(String name) {
		return statusRepository.existsByName(name);
	}

	@Override
	public void createStatus(Status status) {
		statusRepository.save(status);
	}

	@Override
	public boolean existsById(Long id) {
		return statusRepository.existsById(id);
	}

	@Override
	public Object getStatusById(Long id) {
		return statusRepository.findById(id);
	}

	@Override
	public Optional<Status> findById(Long id) {
		return statusRepository.findById(id);
	}

}
