package com.myapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.MediaType;
import com.myapp.datatransferobject.EmployeeDTO;

@RestController
@RequestMapping("/v1/emplmoyee")
public class EmployeeController {

	@GetMapping("/empid")
	public EmployeeDTO getEmployee() {
		return new EmployeeDTO("10","varada","Aganampudi","varadaramana@gmail.com","9885088119");
	}

	@GetMapping("/empid/noargs" )
	public EmployeeDTO getEmployeeNoargs() {
		EmployeeDTO edto = EmployeeDTO.builder().empid("20").empname("ramana").address("hyderabad").email("ramana@gmail.com")
				.phonenumber("7093606547").build();
		return edto;
	}

	@GetMapping("/empid/setters")
	public EmployeeDTO getEmployeeSetters() {
		EmployeeDTO edto = new EmployeeDTO();
		edto.setEmpid("30");
		edto.setEmpname("venkata");
		edto.setAddress("gajuwaka");
		edto.setEmail("venkat@gmail.com");
		edto.setPhonenumber("703454357");
		return edto;
	}
	

}
