package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defect.tracker.data.entities.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

	public boolean existsByEmail(String email);

}
