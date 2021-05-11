package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.Gender;



public interface GenderService {

	public boolean isGenderNameAlreadyExist(String genderName);

	public void createGender(Gender gender);
	
	public List<Gender> getAllGender();
	
	public Object getByIdGender(Long id);
	
	public boolean existsById(Long id);

}
