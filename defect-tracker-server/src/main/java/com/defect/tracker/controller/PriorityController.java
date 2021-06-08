package com.defect.tracker.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.PriorityDto;
import com.defect.tracker.data.entities.Priority;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.PriorityService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class PriorityController {
	@Autowired
	PriorityService priorityService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	/*------------------------------ ADD -------------------------------------*/
	@PostMapping(value = EndpointURI.PRIORITY)
	public ResponseEntity<Object> addProject(@Valid @RequestBody PriorityDto priorityDto) {
		if (priorityService.isPriorityAlreadyExist(priorityDto.getName())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PRIORITY_EXISTS,
					validationFailureStatusCodes.getPriorityNameAlreadyExists()), HttpStatus.BAD_REQUEST);
		}
		Priority priority = mapper.map(priorityDto, Priority.class);
		priorityService.createPriority(priority);
		return new ResponseEntity<Object>(Constants.PRIORITY_ADDED_SUCCESS, HttpStatus.OK);
	}

	/*--------------------- VIEW-BY-ID  OR/ GET-BY-ID -------------------------*/
	@GetMapping(value = EndpointURI.PRIORITY_BY_ID)
	public ResponseEntity<Object> getPriorityById(@PathVariable Long id) {
		if (priorityService.existsById(id)) {
			return new ResponseEntity<Object>(priorityService.getPriorityById(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PRIORITY_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getPriorityExistsById()), HttpStatus.BAD_REQUEST);
	}

}