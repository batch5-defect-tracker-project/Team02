package com.defect.tracker.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;
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

import com.defect.tracker.data.dto.DefectDto;
import com.defect.tracker.data.dto.DefectResponseDto;
import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.DefectService;
import com.defect.tracker.services.ModuleService;
import com.defect.tracker.services.PriorityService;
import com.defect.tracker.services.ProjectService;
import com.defect.tracker.services.SeverityService;
import com.defect.tracker.services.StatusService;
import com.defect.tracker.services.SubModuleService;
import com.defect.tracker.services.TypeService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class DefectController {
	@Autowired
	DefectService defectService;
	@Autowired
	ModuleService moduleService;
	@Autowired
	SubModuleService subModuleService;
	@Autowired
	TypeService typeService;
	@Autowired
	SeverityService severityService;
	@Autowired
	PriorityService priorityService;
	@Autowired
	ProjectService projectService;
	@Autowired
	StatusService statusService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	/*------------------------------ ADD -------------------------------------*/
	@PostMapping(value = EndpointURI.DEFECT)
	public ResponseEntity<Object> addDefect(@Valid @RequestBody DefectDto defectDto)throws UnsupportedEncodingException, MessagingException {
		if (moduleService.existsById(defectDto.getModuleId())) {
			if (subModuleService.existsById(defectDto.getSubModuleId())) {
				if (typeService.existsById(defectDto.getTypeId())) {
					if (severityService.existsById(defectDto.getSeverityId())) {
						if (priorityService.existsById(defectDto.getPriorityId())) {
							if (projectService.existsById(defectDto.getProjectId())) {
								if (statusService.existsById(defectDto.getStatusId())) {
									Defect defect = mapper.map(defectDto, Defect.class);
									defectService.createDefect(defect);
									return new ResponseEntity<Object>(Constants.DEFECT_ADDED_SUCCESS, HttpStatus.OK);
								}
								return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.STATUS_NOT_EXISTS_BY_ID,
												validationFailureStatusCodes.getStatusExistsById()),HttpStatus.BAD_REQUEST);
							}
							return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_NOT_EXISTS_BY_ID,
											validationFailureStatusCodes.getProjectExistsById()),HttpStatus.BAD_REQUEST);
						}
						return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PRIORITY_NOT_EXISTS_BY_ID,
										validationFailureStatusCodes.getPriorityExistsById()),HttpStatus.BAD_REQUEST);
					}
					return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SEVERITY_NOT_EXISTS_BY_ID,
									validationFailureStatusCodes.getSeverityExistsById()),HttpStatus.BAD_REQUEST);
				}
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.TYPE_NOT_EXISTS_BY_ID,
						validationFailureStatusCodes.getTypeExistsById()), HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getSubModuleExistsById()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_EXISTS,
				validationFailureStatusCodes.getModuleExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*--------------------- VIEW ALL OR/ GET ALL ------------------------------*/
	@GetMapping(value = EndpointURI.DEFECT)
	public ResponseEntity<Object> getAllDefect() {
		List<DefectResponseDto> defectList = mapper.map(defectService.getAllDefect(), DefectResponseDto.class);
		return new ResponseEntity<Object>(defectList, HttpStatus.OK);
	}

	/*------------------------- DELETE ----------------------------------------*/
	@DeleteMapping(value = EndpointURI.DEFECT_BY_ID)
	public ResponseEntity<Object> deleteDefect(@PathVariable Long id) {
		if (!defectService.existsByDefectId(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getDefectExistsById()), HttpStatus.BAD_REQUEST);
		}
		defectService.deleteById(id);
		return new ResponseEntity<Object>(Constants.DEFECT_DELETED_SUCCESS, HttpStatus.OK);
	}

	/*--------------------- VIEW-BY-ID  OR/ GET-BY-ID -------------------------*/
	@GetMapping(value = EndpointURI.DEFECT_BY_ID)
	public ResponseEntity<Object> getByIdDefect(@PathVariable Long id) {
		if (defectService.existsById(id)) {
			return new ResponseEntity<Object>(defectService.getByIdDefect(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getDefectExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*--------------------- UPDATE OR/ EDIT -----------------------------------*/
	@PutMapping(value = EndpointURI.DEFECT)
	public ResponseEntity<Object> updateDefect(@Valid @RequestBody DefectDto defectDto)throws UnsupportedEncodingException, MessagingException {
		if (defectService.existsById(defectDto.getId())) {
			if (moduleService.existsById(defectDto.getModuleId())) {
				if (subModuleService.existsById(defectDto.getSubModuleId())) {
					if (typeService.existsById(defectDto.getTypeId())) {
						if (severityService.existsById(defectDto.getSeverityId())) {
							if (priorityService.existsById(defectDto.getPriorityId())) {
								if (projectService.existsById(defectDto.getProjectId())) {
									if (statusService.existsById(defectDto.getStatusId())) {
										Defect defect = mapper.map(defectDto, Defect.class);
										defectService.updateDefect(defect);
										return new ResponseEntity<Object>(Constants.DEFECT_UPDATED_SUCCESS,HttpStatus.OK);
									}
									return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.STATUS_NOT_EXISTS_BY_ID,
													validationFailureStatusCodes.getStatusExistsById()),HttpStatus.BAD_REQUEST);
								}
								return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_NOT_EXISTS_BY_ID,
												validationFailureStatusCodes.getProjectExistsById()),HttpStatus.BAD_REQUEST);
							}
							return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PRIORITY_NOT_EXISTS_BY_ID,
											validationFailureStatusCodes.getPriorityExistsById()),HttpStatus.BAD_REQUEST);
						}
						return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SEVERITY_NOT_EXISTS_BY_ID,
										validationFailureStatusCodes.getSeverityExistsById()),HttpStatus.BAD_REQUEST);
					}
					return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.TYPE_NOT_EXISTS_BY_ID,
							validationFailureStatusCodes.getTypeExistsById()), HttpStatus.BAD_REQUEST);
				}
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_NOT_EXISTS_BY_ID,
								validationFailureStatusCodes.getSubModuleExistsById()),HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_EXISTS,
					validationFailureStatusCodes.getModuleExistsById()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DEFECT_EXISTS,
				validationFailureStatusCodes.getDefectExistsById()), HttpStatus.BAD_REQUEST);
	}

}