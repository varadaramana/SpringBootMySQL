
 package com.myapp.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.AdharDTO;
import com.myapp.datatransferobject.EmpDTO;

@Service
  
 public class AdharService {
	
	@Autowired
	EmpService empService;
	
	public AdharDTO getAdharDto() {
		EmpDTO empdto = empService.getempDTO();
		AdharDTO adto = new AdharDTO();
		
		adto.setAdharId("95584713255");
		adto.setAdharName("kiran kumar naidu");
		adto.setAdharDob("15161985");
		adto.setAdharAddress("Vijayawada");
		adto.setAdharPh("123456789");
		adto.setAdharPincode("500080");
		
		adto.setEmpDto(empdto);
		
		return adto;
		
	}
	 
 }