package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.DepartmentDTO;

@RestController
@RequestMapping("/V1/Dept")
public class DepartmentDetails {

	@GetMapping("/Dept1")
	public DepartmentDTO getDepartmentDetails() {

		DepartmentDTO S1 = new DepartmentDTO("101", "00020", "agp", "955336632");
		return S1;
	}

	@GetMapping("/Dept2")
	public DepartmentDTO getDepartmentDetails1() {
		DepartmentDTO S2 = new DepartmentDTO();
		S2.setDeptAdd("talari");
		S2.setDeptId("102");
		S2.setDeptNum("00030");
		S2.setDeptPh("9666791323");

		return S2;

	}

	@GetMapping("/Dept3")
	public DepartmentDTO getDepartmentDetails2() {
		DepartmentDTO S3 = DepartmentDTO.builder().DeptAdd("Vizag").DeptId("103").DeptNum("0040").DeptPh("7396111572")
				.build();

		return S3;

	}
}
