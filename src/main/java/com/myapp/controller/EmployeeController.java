package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.Employee1DTO;
import com.myapp.service.employee.EmployeeService;

import lombok.Data;

@Data
@RestController
@RequestMapping("/manch")

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/Srini")
	public Employee1DTO getEmployee1DTO() {
		Employee1DTO empDTO2 = employeeService.getemployee1DTO();
		return empDTO2;
		
	}
	

}
