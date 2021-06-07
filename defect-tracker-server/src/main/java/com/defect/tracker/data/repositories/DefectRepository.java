package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.entities.Priority;
import com.defect.tracker.data.entities.Project;

public interface DefectRepository extends JpaRepository<Defect, Long> {

	public Long countByPriorityAndProject(Priority high, Project project);

	public Long countByProject(Project project);

}
