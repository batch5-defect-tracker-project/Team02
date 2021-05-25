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

import com.defect.tracker.data.dto.StatusDto;
import com.defect.tracker.data.entities.Status;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.StatusService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class StatusController {
	@Autowired
	StatusService statusService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	/*------------------------------ ADD -------------------------------------*/
	@PostMapping(value = EndpointURI.STATUS)
	public ResponseEntity<Object> addStatus(@Valid @RequestBody StatusDto statusDto) {
		if (statusService.isStatusNameAlreadyExist(statusDto.getName())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.STATUS_EXISTS,
					validationFailureStatusCodes.getStatusNameAlreadyExists()), HttpStatus.BAD_REQUEST);
		}
		Status status = mapper.map(statusDto, Status.class);
		statusService.createStatus(status);
		return new ResponseEntity<Object>(Constants.STATUS_ADDED_SUCCESS, HttpStatus.OK);
	}

	/*--------------------- VIEW-BY-ID  OR/ GET-BY-ID -------------------------*/
	@GetMapping(value = EndpointURI.STATUS_BY_ID)
	public ResponseEntity<Object> findStatusById(@PathVariable Long id) {
		if (statusService.existsById(id)) {
			return new ResponseEntity<Object>(statusService.getStatusById(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.STATUS_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getStatusExistsById()), HttpStatus.BAD_REQUEST);
	}

}
