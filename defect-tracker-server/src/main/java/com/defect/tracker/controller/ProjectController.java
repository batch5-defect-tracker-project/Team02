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

import com.defect.tracker.data.dto.ProjectDto;
import com.defect.tracker.data.entities.Project;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.ProjectService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class ProjectController {
	@Autowired
	ProjectService projectService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	@PostMapping(value = EndpointURI.PROJECT)
	public ResponseEntity<Object> addProject(@Valid @RequestBody ProjectDto projectDto) {
		if (projectService.isProjectNameAlreadyExist(projectDto.getName())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_EXISTS,
					validationFailureStatusCodes.getProjectNameAlreadyExists()), HttpStatus.BAD_REQUEST);
		}
		Project project = mapper.map(projectDto, Project.class);
		projectService.createProject(project);
		return new ResponseEntity<Object>(Constants.PROJECT_ADDED_SUCCESS, HttpStatus.OK);
	}


	@GetMapping(value = EndpointURI.PROJECT)
	public ResponseEntity<Object> getAllProject() {
		List<ProjectDto> projectList = mapper.map(projectService.getAllProject(), ProjectDto.class);
		return new ResponseEntity<Object>(projectList, HttpStatus.OK);
	}

	@PutMapping(value = EndpointURI.PROJECT)
	public ResponseEntity<Object> updateProject(@RequestBody ProjectDto projectDto) {
		if (projectService.existsById(projectDto.getId())) {
			if (projectService.isProjectNameAlreadyExist(projectDto.getName())) {
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_EXISTS,
						validationFailureStatusCodes.getProjectNameAlreadyExists()), HttpStatus.BAD_REQUEST);
			}

			Project project = mapper.map(projectDto, Project.class);
			projectService.createProject(project);
			return new ResponseEntity<Object>(Constants.PROJECT_UPDATED_SUCCESS, HttpStatus.OK);
		}

		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_EXISTS,
				validationFailureStatusCodes.getProjectExistsById()), HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping(value = EndpointURI.PROJECT_BY_ID)
	public ResponseEntity<Object> deleteProject(@PathVariable Long id) {
		if (!projectService.existsById(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getProjectExistsById()), HttpStatus.BAD_REQUEST);
		}

		projectService.deleteById(id);
		return new ResponseEntity<Object>(Constants.DELETED_SUCCESS, HttpStatus.OK);
	}

	@GetMapping(value = EndpointURI.PROJECT_BY_ID)
	public ResponseEntity<Object> findProjectById(@PathVariable Long id) {
		if(projectService.existsById(id)) {
			return new ResponseEntity<Object>(projectService.getProjectById(id),HttpStatus.OK);
			
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.PROJECT_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getProjectById()), HttpStatus.BAD_REQUEST);
	}

	
}

