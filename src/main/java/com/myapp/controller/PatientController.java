package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.PatientDTO;
import com.myapp.datatransferobject.PatientParent;
import com.myapp.service.car.PatientServise;

@RestController
@RequestMapping("/p1/patient")

public class PatientController {

	@Autowired
	private PatientServise patientServise;

	@PostMapping("/ppost")
	public PatientDTO getPatientPost(@RequestBody PatientParent pp) {
		PatientDTO dt = patientServise.savePatientDo(pp);

		return dt;

	}

	@GetMapping("/pget")
	public PatientDTO getPatienttDTO(@RequestParam("patientid") String patientid) {
		PatientDTO dto = patientServise.getPatientDTO(patientid);
		return dto;

	}
}
