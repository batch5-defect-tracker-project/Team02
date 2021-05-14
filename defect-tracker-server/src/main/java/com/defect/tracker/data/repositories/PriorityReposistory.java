package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Priority;

public interface PriorityReposistory extends JpaRepository<Priority, Long> {

	boolean existsByName(String priorityName);

}
