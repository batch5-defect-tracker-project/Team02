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

	import com.defect.tracker.data.dto.ProjectAllocatorDto;
	
	import com.defect.tracker.data.entities.ProjectAllocator;
	import com.defect.tracker.data.mapper.Mapper;
	import com.defect.tracker.data.response.ValidationFailureResponse;
	import com.defect.tracker.services.ProjectAllocatorService;
	import com.defect.tracker.util.Constants;
	import com.defect.tracker.util.EndpointURI;
	import com.defect.tracker.util.ValidationConstance;
	import com.defect.tracker.util.ValidationFailureStatusCodes;

	@RestController
	public class ProjectAllocatorController {
		@Autowired
		ProjectAllocatorService projectAllocatorService;
		@Autowired
		ValidationFailureStatusCodes validationFailureStatusCodes;
		@Autowired
		private Mapper mapper;

		@PostMapping(value = EndpointURI.PROJECT_ALLOCATER)
		public ResponseEntity<Object> addProjectAllocator(@Valid @RequestBody ProjectAllocatorDto projectAllocatorDto) {
			if (projectAllocatorService.isEmployeeIdAlreadyExist(projectAllocatorDto.getEmployeeId())) {
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_ALLOCATOR_EXISTS,
						validationFailureStatusCodes.getEmployeeIdAlreadyExists()), (HttpStatus) HttpStatus.BAD_REQUEST);
			}
			ProjectAllocator projectAllocator = mapper.map(projectAllocatorDto, ProjectAllocator.class);
			projectAllocatorService.createProjectAllocator(projectAllocator);
			return new ResponseEntity<Object>(Constants.PROJECT_ALLOCATOR_ADDED_SUCCESS, HttpStatus.OK);
		}
		@GetMapping(value = EndpointURI.PROJECT_ALLOCATER)
		public ResponseEntity<Object> getAllProjectAllocator(){
			List<ProjectAllocatorDto> projectAllocatorList = mapper.map(projectAllocatorService.getAllProjectAllocator(), ProjectAllocatorDto.class);
			return new ResponseEntity<Object>(projectAllocatorList,HttpStatus.OK);
			
		}
		
		@PutMapping(value = EndpointURI.PROJECT_ALLOCATER)
		public ResponseEntity<Object> updateProjectAllocator(@RequestBody ProjectAllocatorDto projectAllocatorDto) {
			if (projectAllocatorService.existsById(projectAllocatorDto.getId())) {
				if (projectAllocatorService.isEmployeeIdAlreadyExist(projectAllocatorDto.getEmployeeId())) {
					return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_ID_EXISTS,
							validationFailureStatusCodes.getEmployeeIdAlreadyExists()), (HttpStatus) HttpStatus.BAD_REQUEST);
			}
				
				ProjectAllocator projectAllocator = mapper.map(projectAllocatorDto, ProjectAllocator.class);
				projectAllocatorService.createProjectAllocator(projectAllocator);
				return new ResponseEntity<Object>(Constants.PROJECT_ALLOCATOR_UPDATED_SUCCESS, HttpStatus.OK);
		}
			
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_ALLOCATOR_EXISTS,
				validationFailureStatusCodes.getExistsById()), HttpStatus.BAD_REQUEST);
		}
		
		
		@DeleteMapping(value = EndpointURI.PROJECT_ALLOCATOR_BY_ID)
		public ResponseEntity<Object> deleteProjectAllocator(@PathVariable Long id) {
			if (!projectAllocatorService.existsById(id)) {
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_ALLOCATOR_NOT_EXISTS_BY_ID,
						validationFailureStatusCodes.getExistsById()), HttpStatus.BAD_REQUEST);
			}
			projectAllocatorService.deleteById(id);
			return new ResponseEntity<Object>(Constants.PROJECT_ALLOCATOR_DELETED_SUCCESS, HttpStatus.OK);
		}
		
		
		@GetMapping(value = EndpointURI.PROJECT_ALLOCATOR_BY_ID)
		public ResponseEntity<Object> findProjectAllocatorById(@PathVariable Long id) {
			if (projectAllocatorService.existsById(id)) {
			return new ResponseEntity<Object>(projectAllocatorService.getProjectAllocatorById(id),HttpStatus.OK);
		}
		
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_ALLOCATOR_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getProjectAllocatorById()), HttpStatus.BAD_REQUEST);
		
		
	}


}