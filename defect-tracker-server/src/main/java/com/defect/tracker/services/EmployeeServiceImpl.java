package com.defect.tracker.services;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.modelmapper.internal.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private JavaMailSender mailSender;

	@Override
	public boolean isEmployeeEmailAlreadyExist(String employeeEmail) {
		return employeeRepository.existsByEmail(employeeEmail);
	}

	@Override
	public void createEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public boolean existsById(Long id) {
		return employeeRepository.existsById(id);
	}

	@Override
	public void deleteById(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public Object getByIdEmployee(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public boolean isUpdatedEmployeeEmailAlreadyExist(Long id, String employeeEmail) {
		if ((!employeeRepository.findById(id).get().getEmail().equalsIgnoreCase(employeeEmail))
				&& (isEmployeeEmailAlreadyExist(employeeEmail))) {
			return true;
		}
		return false;
	}
	
	public boolean isEnabled(Employee employee) {
		return employeeRepository.isEnabled(employee);
	}

	@Override
	public void register(Employee employee, String siteURL) throws UnsupportedEncodingException, MessagingException {
		    String encodedPassword = passwordEncoder.encode(employee.getPassword());
		    employee.setPassword(encodedPassword);
		     
		    String randomCode = RandomString.make();
		    employee.setVerificationCode(randomCode);
		    employee.setEnabled(false);
		     
		    employeeRepository.save(employee);
		     
		    sendVerificationEmail(employee, siteURL);	
		
	}

	@Override
	public void sendVerificationEmail(Employee employee, String siteURL) 
		throws MessagingException, UnsupportedEncodingException {
		    String toAddress = employee.getEmail();
		    String fromAddress = "meera10testmail@gmail.com";
		    String senderName = "Team 02";
		    String subject = "Please verify your registration";
		    String content = "Dear [[name]],<br>"
		            + "Please click the link below to verify your registration:<br>"
		            + "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>"
		            + "Thank you,<br>"
		            + "Team 02.";
		     
		    MimeMessage message = mailSender.createMimeMessage();
		    MimeMessageHelper helper = new MimeMessageHelper(message);
		     
		    helper.setFrom(fromAddress, senderName);
		    helper.setTo(toAddress);
		    helper.setSubject(subject);
		     
		    content = content.replace("[[name]]", employee.getName());
		    String verifyURL = siteURL + "/api/v1/verify?code=" + employee.getVerificationCode();
		     
		    content = content.replace("[[URL]]", verifyURL);
		     
		    helper.setText(content, true);
		     
		    mailSender.send(message);	
		    System.out.println(verifyURL);
	}

	@Override
	public boolean verify(String verificationCode) {
		Employee employee = employeeRepository.findByVerificationCode(verificationCode);

		if (employee == null || employee.isEnabled()) {
			return false;
		} else {
			employee.setVerificationCode(verificationCode);
			employee.setEnabled(true);
			employeeRepository.save(employee);

			return true;
		}

	}

}
