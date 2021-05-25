package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Type;

public interface TypeRepository extends JpaRepository<Type, Long>{

	boolean existsByName(String name);

} 
