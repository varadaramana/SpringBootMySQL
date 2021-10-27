package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.DepartmentDTO;

@RestController
@RequestMapping("/D1/department")
public class Departmentcontroller {

	@GetMapping("/departmentdata")
	public DepartmentDTO getDepartmentDTO(@RequestParam("departmentId") String departmentId,
			@RequestParam("departmentName") String departmentName,
			@RequestParam("departmentPlace") String departmentPlace,
			@RequestParam("departmentPhone") String departmentPhone,
			@RequestParam("departmentGmail") String departmentGmail,
			@RequestParam("departmentSalary") String departmentSalary) {
		DepartmentDTO dpt = new DepartmentDTO();
		dpt.setDepartmentId(departmentId);
		dpt.setDepartmentName(departmentName);
		dpt.setDepartmentPlace(departmentPlace);
		dpt.setDepartmentPhone(departmentPhone);
		dpt.setDepartmentGmail(departmentGmail);
		dpt.setDepartmentSalary(departmentSalary);
		return dpt;
	}

	@GetMapping("/departmentHeadder")
	public DepartmentDTO getDepartmentDTOHeadder(@RequestParam("departmentId") String departmentId,
			@RequestParam("departmentName") String departmentName,
			@RequestParam("departmentPlace") String departmentPlace,
			@RequestHeader("departmentPhone") String departmentPhone,
			@RequestHeader("departmentGmail") String departmentGmail,
			@RequestHeader("departmentSalary") String departmentSalary) {

		DepartmentDTO dpt = new DepartmentDTO();
		dpt.setDepartmentId(departmentId);
		dpt.setDepartmentName(departmentName);
		dpt.setDepartmentPlace(departmentPlace);
		dpt.setDepartmentPhone(departmentPhone);
		dpt.setDepartmentGmail(departmentGmail);
		dpt.setDepartmentSalary(departmentSalary);
		return dpt;
	}
}