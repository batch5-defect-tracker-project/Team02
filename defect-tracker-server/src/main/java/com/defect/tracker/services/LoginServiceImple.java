package com.defect.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.repositories.LoginReposistory;

@Service
public class LoginServiceImple implements LoginService {
	@Autowired
	LoginReposistory loginReposistory;
	@Autowired
	private JavaMailSender mailSender;

	@Override
	public void createLogin(Login login) {
		loginReposistory.save(login);
	}

	@Override
	public boolean ExixtsByEmail(String email) {
		return loginReposistory.existsByEmail(email);
	}

	@Override
	public void sendMail(String to, String body, String subject) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("meera10testmail@gmail.com");
		message.setTo(to);
		message.setText(body);
		message.setSubject(subject);

		mailSender.send(message);

	}

}