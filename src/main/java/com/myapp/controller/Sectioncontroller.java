package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.SectionDTO;
import com.myapp.service.car.Sectionservice;

@RestController
@RequestMapping("/S1/ves")
public class Sectioncontroller {
	@Autowired
	private Sectionservice sectionservice;

	@GetMapping("/ves/taking")
	public SectionDTO getsectiondto() {

		SectionDTO sdto = sectionservice.getSectionDTO();

		return sdto;

	}

}
