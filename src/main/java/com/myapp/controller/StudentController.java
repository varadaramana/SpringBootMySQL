package com.myapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.StudentDTO;
import com.myapp.service.car.StudentService;

@RestController
@RequestMapping("/Manchala")

public class StudentController {

	@Autowired
	private StudentService studentService;
	

	@PostMapping("/Srinivas")
	public StudentDTO saveStudentDetails(@RequestBody StudentDTO dto) {
		studentService.saveStudentDetails(dto);
		
		return dto;
	}

}
