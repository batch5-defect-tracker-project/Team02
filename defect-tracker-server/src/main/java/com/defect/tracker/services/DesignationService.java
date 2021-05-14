package com.defect.tracker.services;

import com.defect.tracker.data.entities.Designation;

public interface DesignationService {

	public void createDesignation(Designation designation);

	public boolean isDesignationNameAlreadyExist(String designationName);

}
