package com.defect.tracker.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.defect.tracker.data.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	boolean existsByEmail(String employeeEmail);
	
	boolean isEnabled(Employee employee);
	
	public Employee findByVerificationCode(String code);

	public Object findByEmail(String email);

}
