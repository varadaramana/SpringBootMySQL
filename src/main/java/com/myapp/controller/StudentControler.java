package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.StudentDTO;

@RestController
@RequestMapping("/v1/stuid")
public class StudentControler {
	
	@GetMapping("/studentdetails")
	public StudentDTO getStudentDetails(){
		StudentDTO sc = new StudentDTO("12","srinu","10","vzm","532127");
		return sc;
		
	}
	@GetMapping("/stuid/noargs")
	public  StudentDTO getStudenNoagrs() {
		StudentDTO sc =  StudentDTO.builder().stuId("13").name("sanker").classs("11").address("vizag").pincode("530053").build();
		return sc;
		
	}
	    
	@GetMapping("/stuid/setters")
	public  StudentDTO getStudensetters() {
		StudentDTO sc = new StudentDTO();sc.setStuId("14");sc.setName("kiran");sc.setClasss("12");sc.setAddress("agp");sc.setPincode("530001");
		return sc;
		
	}
}
