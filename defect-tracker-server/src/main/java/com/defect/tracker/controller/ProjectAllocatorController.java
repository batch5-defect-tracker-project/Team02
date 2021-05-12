package com.defect.tracker.controller;

	import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.PostMapping;
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
	}
	


