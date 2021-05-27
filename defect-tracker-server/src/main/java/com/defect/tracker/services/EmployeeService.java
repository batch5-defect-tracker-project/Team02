package com.defect.tracker.services;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;

import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.entities.Login;

public interface EmployeeService {

	public boolean isEmployeeEmailAlreadyExist(String employeeEmail);

	public boolean existsById(Long id);

	public void createEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public void deleteById(Long id);

	public void updateEmployee(Employee employee);

	public Object getByIdEmployee(Long id);

	public boolean isUpdatedEmployeeEmailAlreadyExist(Long id, String employeeEmail);

	public boolean isEnabled(Employee employee);

	public void register(Employee employee, String siteURL) throws UnsupportedEncodingException, MessagingException;

	public void sendVerificationEmail(Employee employee, String siteURL) throws MessagingException, UnsupportedEncodingException;

	public boolean verify(String verificationCode);

	boolean loginEmployee(Login login);

}
