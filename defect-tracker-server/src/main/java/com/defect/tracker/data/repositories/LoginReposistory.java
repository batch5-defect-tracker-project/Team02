package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.defect.tracker.data.entities.Login;

public interface LoginReposistory extends JpaRepository<Login, Long> {

	boolean existsByEmail(String email);

}