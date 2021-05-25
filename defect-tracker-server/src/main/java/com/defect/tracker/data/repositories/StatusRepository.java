package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Status;

public interface StatusRepository extends JpaRepository<Status, Long>{

	boolean existsByName(String name);

} 
