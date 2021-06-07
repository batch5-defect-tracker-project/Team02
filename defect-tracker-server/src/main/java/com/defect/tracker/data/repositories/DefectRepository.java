package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defect.tracker.data.entities.Defect;
import com.defect.tracker.data.entities.Priority;
import com.defect.tracker.data.entities.Project;
import com.defect.tracker.data.entities.Status;

@Repository
public interface DefectRepository extends JpaRepository<Defect, Long>{

	public Long countByPriorityAndProject(Priority priority, Project project);

	public Long countByProject(Project project);

	public Long countByStatusAndProject(Status status, Project project);
	
}