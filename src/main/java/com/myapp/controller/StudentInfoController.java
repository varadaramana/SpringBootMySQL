package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.StudentInfoDTO;
import com.myapp.service.car.StudentService;

@RestController
@RequestMapping("/s1/student")

public class StudentInfoController {
	@Autowired
	private StudentService studentservice;

	@GetMapping("/stdInfo")
	public StudentInfoDTO getStudentInfo() {
		return new StudentInfoDTO("1","10th","A","Gurunadharao",566);
		
	}
		
		
		@PostMapping("/std/noargs")
		public String getstudentnoargs(@RequestBody StudentInfoDTO dto) {
			studentservice.savestudentinfo(dto);
			return "saved succesfully";
		}
		
	
		
		
		
		
		
	
		
	}


