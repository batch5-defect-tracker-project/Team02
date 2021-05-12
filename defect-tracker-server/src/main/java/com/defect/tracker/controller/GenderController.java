package com.defect.tracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.GenderDto;
import com.defect.tracker.data.entities.Gender;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.GenderService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class GenderController {
	@Autowired
	GenderService genderService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	@PostMapping(value = EndpointURI.GENDER)
	public ResponseEntity<Object> addGender(@Valid @RequestBody GenderDto genderDto) {
		if (genderService.isGenderAlreadyExist(genderDto.getGender())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.GENDER_EXISTS,
					validationFailureStatusCodes.getGenderAlreadyExists()), HttpStatus.BAD_REQUEST);
		}
		Gender gender = mapper.map(genderDto, Gender.class);
		genderService.createGender(gender);
		return new ResponseEntity<Object>(Constants.GENDER_ADDED_SUCCESS, HttpStatus.OK);
	}
	
	@GetMapping(value = EndpointURI.GENDER)
	public ResponseEntity<Object> getAllGender() {
		List<GenderDto> genderList = mapper.map(genderService.getAllGender(), GenderDto.class);
		return new ResponseEntity<Object>(genderList, HttpStatus.OK);
	}
	
	@GetMapping(value = EndpointURI.GENDER_BY_ID)
	public ResponseEntity<Object> getByIdGender(@PathVariable Long id) {
		if (genderService.existsById(id)) {
			return new ResponseEntity<Object>(genderService.getByIdGender(id), HttpStatus.OK);
			
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getGenderExistsById()), HttpStatus.BAD_REQUEST);
	}
}
