package com.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.AdharDTO;
import com.myapp.service.car.AdharService;

@RestController
@RequestMapping("/a1/adhar")

public class AdharController {
	
	@Autowired
	AdharService adharService;
	
	@GetMapping("/adhar/emp")
	public AdharDTO getAdharDto() {
		AdharDTO adhar = adharService.getAdharDto();
			
		return adhar;
		
	}
}
