package com.defect.tracker.services;

import com.defect.tracker.data.entities.Login;

public interface LoginService {

	public void createLogin(Login login);

	public boolean ExixtsByEmail(String email);

	public void sendMail(String email, String string, String string2);

}