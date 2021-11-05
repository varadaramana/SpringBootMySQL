package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.EmpDTO;
import com.myapp.service.car.EmpService;

@RestController
@RequestMapping("/e1/employee")

public class EmpController {

	@Autowired
	private EmpService empService;

	@GetMapping("/emp/dep/add")
	public EmpDTO getempDto() {
		EmpDTO emp = empService.getempDTO();

		return emp;

	}

}
