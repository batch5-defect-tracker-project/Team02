package com.defect.tracker.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.DesignationDto;
import com.defect.tracker.data.entities.Designation;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.DesignationService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class DesignationController {
	@Autowired
	DesignationService designationService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;
	
	@PostMapping(value=EndpointURI.DESIGNATION)
	public ResponseEntity<Object> addDesignation(@Valid @RequestBody DesignationDto designationDto){
		if(designationService.isDesignationNameAlreadyExist(designationDto.getName())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DESIGNATION_EXISTS,
					validationFailureStatusCodes.getDesignationNameAlreadyExists()),HttpStatus.BAD_REQUEST);
		}
		Designation designation=mapper.map(designationDto, Designation.class);
		designationService.createDesignation(designation);
		return new ResponseEntity<Object>(Constants.DESIGNATION_ADDED_SUCCESS,HttpStatus.OK);
	}

}