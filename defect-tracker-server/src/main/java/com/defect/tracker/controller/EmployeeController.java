package com.defect.tracker.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.EmployeeDto;
import com.defect.tracker.data.dto.EmployeeResponseDto;
import com.defect.tracker.data.dto.LoginDto;
import com.defect.tracker.data.entities.Employee;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.data.response.ValidationFailureResponse;
import com.defect.tracker.services.DesignationService;
import com.defect.tracker.services.EmployeeService;
import com.defect.tracker.services.GenderService;
import com.defect.tracker.util.Constants;
import com.defect.tracker.util.EndpointURI;
import com.defect.tracker.util.ValidationConstance;
import com.defect.tracker.util.ValidationFailureStatusCodes;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@Autowired
	GenderService genderService;
	@Autowired
	DesignationService designationService;
	@Autowired
	ValidationFailureStatusCodes validationFailureStatusCodes;
	@Autowired
	private Mapper mapper;

	/*------------------------------ REGISTER -------------------------------------*/
	@PostMapping(value = EndpointURI.EMPLOYEE_REGISTER)
	public ResponseEntity<Object> processRegister(@Valid @RequestBody EmployeeDto employeeDto,HttpServletRequest request) throws UnsupportedEncodingException, MessagingException {
		if (genderService.existsById(employeeDto.getGenderId())) {
			if (designationService.existsById(employeeDto.getDesignationId())) {
				if (employeeService.isEmployeeEmailAlreadyExist(employeeDto.getEmail())) {
					return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_EXISTS,
									validationFailureStatusCodes.getEmployeeEmailAlreadyExists()),HttpStatus.BAD_REQUEST);
				}
				Employee employee = mapper.map(employeeDto, Employee.class);
				employeeService.register(employee, getSiteURL(request));
				return new ResponseEntity<Object>(Constants.EMPLOYEE_ADDED_SUCCESS, HttpStatus.OK);
			}
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DESIGNATION_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getDesignationExistsById()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.GENDER_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getGenderExistsById()), HttpStatus.BAD_REQUEST);
	}

	private String getSiteURL(HttpServletRequest request) {
		String siteURL = request.getRequestURL().toString();
		return siteURL.replace(request.getServletPath(), "");
	}

	/*--------------------- VIEW ALL OR/ GET ALL ------------------------------*/
	@GetMapping(value = EndpointURI.EMPLOYEE)
	public ResponseEntity<Object> getAllEmployee() {
		List<EmployeeResponseDto> employeeList = mapper.map(employeeService.getAllEmployee(),EmployeeResponseDto.class);
		return new ResponseEntity<Object>(employeeList, HttpStatus.OK);
	}

	/*--------------------- UPDATE OR/ EDIT -----------------------------------*/
	@PutMapping(value = EndpointURI.EMPLOYEE_REGISTER)
	public ResponseEntity<Object> updateEmployee(@Valid @RequestBody EmployeeDto employeeDto) {
		if (employeeService.existsById(employeeDto.getId())) {
			if (genderService.existsById(employeeDto.getGenderId())) {
				if (designationService.existsById(employeeDto.getDesignationId())) {
					if (employeeService.isUpdatedEmployeeEmailAlreadyExist(employeeDto.getId(),employeeDto.getEmail())) {
						return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_EXISTS,
										validationFailureStatusCodes.getEmployeeEmailAlreadyExists()),HttpStatus.BAD_REQUEST);
					}
					Employee employee = mapper.map(employeeDto, Employee.class);
					employeeService.updateEmployee(employee);
					return new ResponseEntity<Object>(Constants.EMPLOYEE_UPDATED_SUCCESS, HttpStatus.OK);
				}
				return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.DESIGNATION_NOT_EXISTS_BY_ID,
								validationFailureStatusCodes.getDesignationExistsById()),HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.GENDER_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getGenderExistsById()), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getEmployeeExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*------------------------- DELETE ----------------------------------------*/
	@DeleteMapping(value = EndpointURI.EMPLOYEE_BY_ID)
	public ResponseEntity<Object> deleteEmployee(@PathVariable Long id) {
		if (!employeeService.existsById(id)) {
			return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_EXISTS_BY_ID,
					validationFailureStatusCodes.getEmployeeExistsById()), HttpStatus.BAD_REQUEST);
		}
		employeeService.deleteById(id);
		return new ResponseEntity<Object>(Constants.EMPLOYEE_DELETED_SUCCESS, HttpStatus.OK);
	}

	/*--------------------- VIEW-BY-ID  OR/ GET-BY-ID -------------------------*/
	@GetMapping(value = EndpointURI.EMPLOYEE_BY_ID)
	public ResponseEntity<Object> getByIdEmployee(@PathVariable Long id) {
		if (employeeService.existsById(id)) {
			return new ResponseEntity<Object>(employeeService.getByIdEmployee(id), HttpStatus.OK);
		}
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_EXISTS_BY_ID,
				validationFailureStatusCodes.getEmployeeExistsById()), HttpStatus.BAD_REQUEST);
	}

	/*------------------------------ VERIFY -------------------------------------*/
	@GetMapping(value = EndpointURI.EMPLOYEE_VERIFY)
	public String verifyEmployee(@Param("code") String code) {
		if (employeeService.verify(code)) {
			return "Verification Successful......! ";
		} else {
			return "Verification Fail";
		}
	}

	/*------------------------------ LOGIN -------------------------------------*/
	@PostMapping(value = EndpointURI.LOGIN)
	public ResponseEntity<Object> Login(@Valid @RequestBody LoginDto loginDto, EmployeeDto employeeDto) {
		if (employeeService.loginEmployee(loginDto)) {
		return new ResponseEntity<>(new ValidationFailureResponse(ValidationConstance.EMPLOYEE_NOT_REGISTER,
				validationFailureStatusCodes.getExistsByEmail()), HttpStatus.BAD_REQUEST);
		}
		employeeService.loginEmployee(loginDto);
		return new ResponseEntity<Object>(Constants.LOGIN_SUCCESS, HttpStatus.OK);
	}

}