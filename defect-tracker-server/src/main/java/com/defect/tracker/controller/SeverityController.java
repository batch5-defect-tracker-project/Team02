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

import com.defect.tracker.data.dto.SeverityDto;
import com.defect.tracker.data.entities.Severity;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.SeverityService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class SeverityController {

	@Autowired
	SeverityService severityService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	/*------------------------------ ADD -------------------------------------*/
	@PostMapping(value = EndpointURI.SEVERITY)
	public ResponseEntity<Object> addSeverity(@Valid @RequestBody SeverityDto severityDto) {
		if (severityService.isSeverityNameAlreadyExist(severityDto.getName())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SEVERITY_EXISTS,
					validationFailureStatusCodes.getSeverityNameAlreadyExists()), HttpStatus.BAD_REQUEST);
		}
		Severity severity = mapper.map(severityDto, Severity.class);
		severityService.createSeverity(severity);
		return new ResponseEntity<Object>(Constants.SEVERITY_ADDED_SUCCESS, HttpStatus.OK);
	}

	/*--------------------- VIEW-BY-ID  OR/ GET-BY-ID -------------------------*/
	@GetMapping(value = EndpointURI.SEVERITY_BY_ID)
	public ResponseEntity<Object> findSeverityrById(@PathVariable Long id) {
		if (severityService.existsById(id)) {
			return new ResponseEntity<Object>(severityService.getSeverityById(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SEVERITY_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getSeverityExistsById()), HttpStatus.BAD_REQUEST);
	}
}
