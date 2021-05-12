package com.defect.tracker.services;

import com.defect.tracker.data.entities.Project;

public interface ProjectService {

	public boolean isProjectNameAlreadyExist(String projectName);

	public void createProject(Project project);
}
