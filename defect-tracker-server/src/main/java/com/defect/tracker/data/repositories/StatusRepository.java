package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defect.tracker.data.entities.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long>{

	public boolean existsByName(String name);

	public Status findByName(String statusName);

} 
