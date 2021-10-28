package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.PatientDTO;

@RestController
@RequestMapping("P1/patient")
public class Patientcontroller {

	@GetMapping("/patid/Allargs")
	public PatientDTO getPatientallargs() {
		return new PatientDTO("230","ravi","attada","9133010525","mattagani@gmail.com") ;
	}
	@GetMapping("/patient/Noargs")
	public PatientDTO getPatientnoargs() {
		 PatientDTO pdto = PatientDTO.builder()
				 .patientId("230")
				 .patientName("ravi")
				 .patientPlace("attada")
				 .patientPhone("9133010525")
				 .patientGmail("mattagani@gmail.com")
				 .build();
	
		return pdto;
	}
	@GetMapping("/patient/setters")
	public PatientDTO getPatientsetters() {
		 PatientDTO pdto = new PatientDTO ();
		 pdto.setPatientId("230");
		 pdto.setPatientName("ravi");
		 pdto.setPatientPlace("attada");
		 pdto.setPatientPhone("9133010525");
		 pdto.setPatientGmail("mattagani@gmail.com");
		 return pdto;
}
}
