package com.defect.tracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Gender;
import com.defect.tracker.data.repositories.GenderRepository;



@Service
public class GenderServiceImpl implements GenderService {
	@Autowired
	private GenderRepository genderRepository;

	@Override
	public boolean isGenderAlreadyExist(String gender) {
		return genderRepository.existsByGender(gender);
	}

	@Override
	public void createGender(Gender gender) {
		genderRepository.save(gender);
	}

	@Override
	public List<Gender> getAllGender() {
		return genderRepository.findAll();
	}
	
	@Override
	public boolean existsById(Long id) {
		return genderRepository.existsById(id);
	}
	
	@Override
	public Object getByIdGender(Long id) {
		return genderRepository.findById(id);
	}
}
