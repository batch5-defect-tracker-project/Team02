package com.defect.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.repositories.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginRepository loginRepository;

	@Override 
	public void createLogin(Login login) {
		loginRepository.save(login);
	}

	@Override
	public boolean ExixtsByEmail(String email) {
		return loginRepository.existsByEmail(email);
	}

}