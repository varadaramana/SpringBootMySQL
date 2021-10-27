package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.StudentDTO;
import com.myapp.datatransferobject.StudentSuper;
import com.myapp.service.car.StudentService;

@RestController
@RequestMapping("/s1/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/std/data")
	public StudentDTO getstudentData(@RequestBody StudentSuper sv) {
		StudentDTO dt = studentService.saveStudentDo(sv);
		return dt;
				
	}
	@GetMapping("/std/retrieve")
	public StudentDTO getStudentDTO(@RequestParam("studentid") String studentid) {
		StudentDTO dto = studentService.getStudentDTO(studentid);
		return dto;
		
		
	}
	


}
