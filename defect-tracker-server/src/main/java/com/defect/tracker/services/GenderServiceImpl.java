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
	public boolean isGenderNameAlreadyExist(String genderName) {
		return genderRepository.existsByName(genderName);
	}

	@Override
	public void createGender(Gender gender) {
		genderRepository.save(gender);
	}

	@Override
	public List<Gender> getAllGender() {
		return genderRepository.findAll();
	}

}
