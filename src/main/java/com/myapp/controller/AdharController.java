package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.AdharDTO;

@RestController
@RequestMapping("/A1/Adhar")
public class AdharController {

	@GetMapping("/name")
	public AdharDTO getAdhar() {

		return new AdharDTO("guru", "697834561234", "aganampudu", "7396111572", "21/08/1995");
	}

	@GetMapping("/adharNoargs")
	public AdharDTO getAdharnoargs() {
		AdharDTO adr = AdharDTO.builder().name("guru").adharnum("69783456123").adress("aganampudi").phnum("7396111572")
				.DOB("21/08/1995").build();
		return adr;
	}

	@GetMapping("/adharargs")
	public AdharDTO getAdharargs() {
		AdharDTO adhr = new AdharDTO();
		adhr.setName("guru");
		adhr.setAdharnum("6534756689");
		adhr.setAdress("aganapudi");
		adhr.setPhnum("8555858661");
		adhr.setDOB("21/08/1995");
		return adhr;

	}

}
