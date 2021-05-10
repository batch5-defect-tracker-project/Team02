package com.defect.tracker.services;

import java.util.List;

import com.defect.tracker.data.entities.Employee;



public interface EmployeeService {

	public boolean isEmployeeEmailAlreadyExist(String employeeEmail);
	
	public boolean existsById(Long id);

	public void createEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public void deleteById(Long id);
	
}
