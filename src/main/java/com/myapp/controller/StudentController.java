package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.StudentDTO;

@RestController
@RequestMapping("/v1/student")
public class StudentController {

	@GetMapping("/studid")
public StudentDTO getStudentDTO(
		@RequestParam("stuid") String stuid,
		@RequestParam("stuname") String stuname,
		@RequestParam("address") String address, 
		@RequestParam("phonenumber") String phonenumber,
		@RequestParam("email") String email) {
		
		StudentDTO std = new StudentDTO();
		std.setStuid(stuid);
		std.setStuname(stuname);
		std.setAddress(address);
		std.setPhonenumber(phonenumber);
		std.setEmail(email); 
	
		
		
		
	return std;
	
}

}
