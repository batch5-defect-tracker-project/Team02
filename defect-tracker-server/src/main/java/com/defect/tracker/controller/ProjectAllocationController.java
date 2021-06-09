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

import com.defect.tracker.data.dto.ProjectAllocationDto;
import com.defect.tracker.data.entities.ProjectAllocation;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.EmployeeService;
import com.defect.tracker.services.ModuleService;
import com.defect.tracker.services.ProjectAllocationService;
import com.defect.tracker.services.ProjectService;
import com.defect.tracker.services.SubModuleService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class ProjectAllocationController {
	@Autowired
	ProjectAllocationService projectAllocationService;
	@Autowired
	ProjectService projectService;
	@Autowired
	EmployeeService employeeService;
	@Autowired
	ModuleService moduleService;
	@Autowired
	SubModuleService subModuleService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;

	@Autowired
	private Mapper mapper;

	/*------------------------------ ADD -------------------------------------*/
	@PostMapping(value = EndpointURI.PROJECT_ALLOCATION)
	public ResponseEntity<Object> addProjectAllocation(@Valid @RequestBody ProjectAllocationDto projectAllocationDto) {
		if (projectService.existsById(projectAllocationDto.getProjectId())) {
			if (employeeService.existsById(projectAllocationDto.getEmployeeId())) {
				if (moduleService.existsById(projectAllocationDto.getModuleId())) {
					if (subModuleService.existsById(projectAllocationDto.getSubModuleId())) {
						ProjectAllocation projectAllocation = mapper.map(projectAllocationDto, ProjectAllocation.class);
						projectAllocationService.createProjectAllocation(projectAllocation);
						return new ResponseEntity<Object>(Constants.PROJECT_ALLOCATION_ADDED_SUCCESS, HttpStatus.OK);
					}
					return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.SUBMODULE_NOT_EXISTS_BY_ID,
									validationFailureStatusCodes.getSubModuleExistsById()),HttpStatus.BAD_REQUEST);
				}
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.MODULE_NOT_EXISTS_BY_ID,
						validationFailureStatusCodes.getModuleExistsById()), HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getEmployeeExistsById()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getProjectExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*--------------------- VIEW ALL OR/ GET ALL ------------------------------*/
	@GetMapping(value = EndpointURI.PROJECT_ALLOCATION)
	public ResponseEntity<Object> getAllProjectAllocation() {
		List<ProjectAllocationDto> projectAllocationList = mapper.map(projectAllocationService.getAllProjectAllocation(), ProjectAllocationDto.class);
		return new ResponseEntity<Object>(projectAllocationList, HttpStatus.OK);
	}

	/*--------------------- UPDATE OR/ EDIT -----------------------------------*/
	@PutMapping(value = EndpointURI.PROJECT_ALLOCATION)
	public ResponseEntity<Object> updateProjectAllocation(
			@Valid @RequestBody ProjectAllocationDto projectAllocationDto) {
		if (projectAllocationService.existsById(projectAllocationDto.getId())) {
			if (projectService.existsById(projectAllocationDto.getProjectId())) {
				if (employeeService.existsById(projectAllocationDto.getEmployeeId())) {
					if (moduleService.existsById(projectAllocationDto.getModuleId())) {
						if (subModuleService.existsById(projectAllocationDto.getSubModuleId())) {
							ProjectAllocation projectAllocation = mapper.map(projectAllocationDto,ProjectAllocation.class);
							projectAllocationService.updateProjectAllocation(projectAllocation);
							return new ResponseEntity<Object>(Constants.PROJECT_ALLOCATION_UPDATED_SUCCESS,
									HttpStatus.OK);
						}
						return new ResponseEntity<>(
								new ValidationFailureResponse(ValidationConstance.SUBMODULE_NOT_EXISTS_BY_ID,
										validationFailureStatusCodes.getSubModuleExistsById()),
								HttpStatus.BAD_REQUEST);
					}
					return new ResponseEntity<>(
							new ValidationFailureResponse(ValidationConstance.MODULE_NOT_EXISTS_BY_ID,
									validationFailureStatusCodes.getModuleExistsById()),
							HttpStatus.BAD_REQUEST);
				}
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_EXISTS_BY_ID,
						validationFailureStatusCodes.getEmployeeExistsById()), HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getProjectExistsById()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_ALLOCATION_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getProjectAllocationExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*------------------------- DELETE ----------------------------------------*/
	@DeleteMapping(value = EndpointURI.PROJECT_ALLOCATION_BY_ID)
	public ResponseEntity<Object> deleteProjectAllocation(@PathVariable Long id) {
		if (!projectAllocationService.existsById(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_ALLOCATION_NOT_EXISTS_BY_ID,
							validationFailureStatusCodes.getProjectAllocationExistsById()),HttpStatus.BAD_REQUEST);
		}
		projectAllocationService.deleteById(id);
		return new ResponseEntity<Object>(Constants.PROJECT_ALLOCATION_DELETED_SUCCESS, HttpStatus.OK);
	}

	/*--------------------- VIEW-BY-ID  OR/ GET-BY-ID -------------------------*/
	@GetMapping(value = EndpointURI.PROJECT_ALLOCATION_BY_ID)
	public ResponseEntity<Object> getProjectAllocationById(@PathVariable Long id) {
		if (projectAllocationService.existsById(id)) {
			return new ResponseEntity<Object>(projectAllocationService.getProjectAllocationById(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_ALLOCATION_NOT_EXISTS_BY_ID,
						validationFailureStatusCodes.getProjectAllocationExistsById()),HttpStatus.BAD_REQUEST);
	}

}