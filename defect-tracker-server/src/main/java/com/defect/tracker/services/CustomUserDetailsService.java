package com.defect.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.CustomUserDetails;
import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.repositories.EmployeeRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Employee employee = employeeRepository.findByEmail(email);
		System.out.println(employee);
		if (employee == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new CustomUserDetails(employee);
	}
}
