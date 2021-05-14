package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defect.tracker.data.entities.Gender;

@Repository
public interface GenderRepository extends JpaRepository<Gender, Long> {
	boolean existsByName(String genderName);
}
