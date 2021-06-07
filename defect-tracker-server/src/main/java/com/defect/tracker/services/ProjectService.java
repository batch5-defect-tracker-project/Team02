package com.defect.tracker.services;

import java.util.List;
import java.util.Optional;

import com.defect.tracker.data.entities.Project;

public interface ProjectService {

	public boolean isProjectNameAlreadyExist(String projectName);

	public void createProject(Project project);

	public List<Project> getAllProject();

	public void updateProject(Project project);

	public boolean existsById(Long id);

	public void deleteById(Long id);

	public Object getProjectById(Long id);

	public boolean isUpdatedProjectNameAlreadyExist(Long id, String projectName);

	public Optional<Project> findById(Long id);

}