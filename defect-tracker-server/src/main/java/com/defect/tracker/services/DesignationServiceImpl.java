package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Designation;
import com.defect.tracker.data.repositories.DesignationRepository;

@Service
public class DesignationServiceImpl implements DesignationService {

	@Autowired
	private DesignationRepository designationRepository;

	@Override
	public void createDesignation(Designation designation) {
		designationRepository.save(designation);

	}

	@Override
	public boolean isDesignationNameAlreadyExist(String designationName) {
		return designationRepository.existsByName(designationName);
	}

	@Override
	public void updateDesignation(Designation designation) {
		designationRepository.save(designation);
		
	}

	@Override
	public boolean existsById(Long id) {
		return designationRepository.existsById(id);
	}

	@Override
	public List<Designation> getAllDesignation() {
		return designationRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		designationRepository.deleteById(id);
		
	}

	@Override
	public Object getDesignationById(Long id) {
		return designationRepository.findById(id);
	}
}
