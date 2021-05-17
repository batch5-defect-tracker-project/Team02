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

import com.defect.tracker.data.dto.TypeDto;
import com.defect.tracker.data.entities.Type;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.TypeService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class TypeController {
	@Autowired
	TypeService typeService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	/*------------------------------ ADD -------------------------------------*/
	@PostMapping(value = EndpointURI.TYPE)
	public ResponseEntity<Object> addType(@Valid @RequestBody TypeDto typeDto) {
		if (typeService.isTypeNameAlreadyExist(typeDto.getName())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.TYPE_EXISTS,
					validationFailureStatusCodes.getTypeNameAlreadyExists()), HttpStatus.BAD_REQUEST);
		}
		Type type = mapper.map(typeDto, Type.class);
		typeService.createType(type);
		return new ResponseEntity<Object>(Constants.TYPE_ADDED_SUCCESS, HttpStatus.OK);
	}

	/*--------------------- VIEW-BY-ID  OR/ GET-BY-ID -------------------------*/
	@GetMapping(value = EndpointURI.TYPE_BY_ID)
	public ResponseEntity<Object> findTypeById(@PathVariable Long id) {
		if (typeService.existsById(id)) {
			return new ResponseEntity<Object>(typeService.getTypeById(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.TYPE_EXISTS_BY_ID,
				validationFailureStatusCodes.getTypeExistsById()), HttpStatus.BAD_REQUEST);
	}

}
