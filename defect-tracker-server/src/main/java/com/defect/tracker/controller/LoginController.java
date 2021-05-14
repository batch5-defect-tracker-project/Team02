package com.defect.tracker.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.LoginDto;
import com.defect.tracker.data.entities.Login;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.LoginService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	@PostMapping(value = EndpointURI.LOGIN)
	public ResponseEntity<Object> addLogin(@Valid @RequestBody LoginDto loginDto) {
		if (loginService.ExixtsByEmail(loginDto.getEmail())) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.LOGIN_EXISTS,
					validationFailureStatusCodes.getExistsByEmail()), HttpStatus.BAD_REQUEST);
		}
		Login login = mapper.map(loginDto, Login.class);
		loginService.createLogin(login);
		loginService.sendMail(loginDto.getEmail(), "Hi " + loginDto.getEmail() + "\n Register Successfull",
				"Conformation");
		return new ResponseEntity<Object>(Constants.LOGIN_ADDED_SUCCESS, HttpStatus.OK);
	}

}