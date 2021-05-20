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

import com.defect.tracker.data.entities.Module;
import com.defect.tracker.data.dto.ModuleDto;
import com.defect.tracker.data.dto.ModuleResponseDto;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.ModuleService;
import com.defect.tracker.services.ProjectService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class ModuleController {
	@Autowired
	ModuleService moduleService;
	@Autowired
	ProjectService projectService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	/*------------------------------ ADD -------------------------------------*/
	@PostMapping(value = EndpointURI.MODULE)
	public ResponseEntity<Object> addModule(@Valid @RequestBody ModuleDto moduleDto) {
		if (projectService.existsById(moduleDto.getProjectId())) {
			if (moduleService.isModuleNameAlreadyExist(moduleDto.getName())) {
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_EXISTS,
						validationFailureStatusCodes.getModuleNameAlreadyExists()), HttpStatus.BAD_REQUEST);
			}
			Module module = mapper.map(moduleDto, Module.class);
			moduleService.createModule(module);
			return new ResponseEntity<Object>(Constants.MODULE_ADDED_SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getProjectExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*--------------------- UPDATE OR/ EDIT -----------------------------------*/
	@PutMapping(value = EndpointURI.MODULE)
	public ResponseEntity<Object> updateModule(@Valid @RequestBody ModuleDto moduleDto) {
		if (moduleService.existsById(moduleDto.getId())) {
			if (projectService.existsById(moduleDto.getProjectId())) {
				if (moduleService.isUpdatedModuleNameAlreadyExist(moduleDto.getId(), moduleDto.getName())) {
					return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_EXISTS,
							validationFailureStatusCodes.getModuleNameAlreadyExists()), HttpStatus.BAD_REQUEST);
				}
				Module module = mapper.map(moduleDto, Module.class);
				moduleService.updateModule(module);
				return new ResponseEntity<Object>(Constants.MODULE_UPDATED_SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getProjectExistsById()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_EXISTS,
				validationFailureStatusCodes.getModuleExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*--------------------- VIEW ALL OR/ GET ALL ------------------------------*/
	@GetMapping(value = EndpointURI.MODULE)
	public ResponseEntity<Object> getAllModule() {
		List<ModuleResponseDto> moduleList = mapper.map(moduleService.getAllModule(), ModuleResponseDto.class);
		return new ResponseEntity<Object>(moduleList, HttpStatus.OK);
	}

	/*--------------------- VIEW-BY-ID  OR/ GET-BY-ID -------------------------*/
	@GetMapping(value = EndpointURI.MODULE_BY_ID)
	public ResponseEntity<Object> findModuleById(@PathVariable Long id) {
		if (moduleService.existsById(id)) {
			return new ResponseEntity<Object>(moduleService.getModuleById(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getModuleExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*------------------------- DELETE ----------------------------------------*/
	@DeleteMapping(value = EndpointURI.MODULE_BY_ID)
	public ResponseEntity<Object> deleteModule(@PathVariable Long id) {
		if (!moduleService.existsById(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getModuleExistsById()), HttpStatus.BAD_REQUEST);
		}
		moduleService.deleteById(id);
		return new ResponseEntity<Object>(Constants.MODULE_DELETED_SUCCESS, HttpStatus.OK);
	}

}
