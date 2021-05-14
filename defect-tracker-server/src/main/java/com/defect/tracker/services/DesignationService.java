package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.Designation;

public interface DesignationService {
	
	public void createDesignation(Designation designation);

	public boolean isDesignationNameAlreadyExist(String designationName);
	
	public void updateDesignation(Designation designation);

	public boolean existsById(Long id);

	public List<Designation> getAllDesignation();

	public void deleteById(Long id);
	
	public Object getDesignationById(Long id);
	
	

}
