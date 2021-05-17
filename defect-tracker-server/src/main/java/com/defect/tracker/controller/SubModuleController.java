package com.defect.tracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.SubModuleDto;
import com.defect.tracker.data.entities.SubModule;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.SubModuleService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class SubModuleController {
	@Autowired
	SubModuleService subModuleService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	/*------------------------------ ADD -------------------------------------*/
	@PostMapping(value = EndpointURI.SUBMODULE)
	public ResponseEntity<Object> addSubModule(@Valid @RequestBody SubModuleDto subModuleDto) {
		if (subModuleService.isSubModuleNameAlreadyExist(subModuleDto.getName())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_EXISTS,

					validationFailureStatusCodes.getSubModuleNameAlreadyExists()), HttpStatus.BAD_REQUEST);
		}
		SubModule subModule = mapper.map(subModuleDto, SubModule.class);
		subModuleService.createSubModule(subModule);
		return new ResponseEntity<Object>(Constants.SUBMODULE_ADDED_SUCCESS, HttpStatus.OK);
	}

	/*--------------------- UPDATE OR/ EDIT -----------------------------------*/
	@PutMapping(value = EndpointURI.SUBMODULE)
	public ResponseEntity<Object> updateSubModule(@RequestBody SubModuleDto subModuleDto) {
		if (subModuleService.existsById(subModuleDto.getId())) {
			if (subModuleService.isSubModuleNameAlreadyExist(subModuleDto.getName())) {
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_EXISTS,
						validationFailureStatusCodes.getSubModuleNameAlreadyExists()), HttpStatus.BAD_REQUEST);
			}
			SubModule subModule = mapper.map(subModuleDto, SubModule.class);
			subModuleService.createSubModule(subModule);
			return new ResponseEntity<Object>(Constants.SUBMODULE_UPDATED_SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_EXISTS,
				validationFailureStatusCodes.getSubModuleExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*--------------------- VIEW ALL OR/ GET ALL ------------------------------*/
	@GetMapping(value = EndpointURI.SUBMODULE)
	public ResponseEntity<Object> getAllSubModule() {
		List<SubModuleDto> subModuleList = mapper.map(subModuleService.getAllSubModule(), SubModuleDto.class);
		return new ResponseEntity<Object>(subModuleList, HttpStatus.OK);

	}

	/*--------------------- VIEW-BY-ID  OR/ GET-BY-ID -------------------------*/
	@GetMapping(value = EndpointURI.SUBMODULE_BY_ID)
	public ResponseEntity<Object> findSubModuleById(@PathVariable Long id) {
		if (subModuleService.existsById(id)) {
			return new ResponseEntity<Object>(subModuleService.getSubModuleById(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getSubModuleExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*------------------------- DELETE ----------------------------------------*/
	@DeleteMapping(value = EndpointURI.SUBMODULE_BY_ID)
	public ResponseEntity<Object> deleteSubModule(@PathVariable Long id) {
		if (!subModuleService.existsById(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getSubModuleExistsById()), HttpStatus.BAD_REQUEST);
		}
		subModuleService.deleteById(id);
		return new ResponseEntity<Object>(Constants.SUBMODULE_DELETED_SUCCESS, HttpStatus.OK);
	}

}
