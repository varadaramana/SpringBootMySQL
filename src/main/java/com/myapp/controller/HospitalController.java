package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.HospitalDTO;

@RestController
@RequestMapping ("M1/hospital")

public class HospitalController {
	
	@GetMapping("/hospitalId")
	public HospitalDTO gethospital() {
		return new HospitalDTO("123" , "KGH","vizag","1234567891");
				
	}
@GetMapping("/noargs")
public HospitalDTO gethospitalnoargs() {
	HospitalDTO hs = HospitalDTO.builder().hospitalId("6546545").hospitalName("ABCD").
			hospitalLocation("vizag").hospitalPhone("3214569871").build();
	return hs;		
}

@GetMapping("/hospitalId/setter")
public HospitalDTO gethospitalArgs() {
	HospitalDTO hs = new HospitalDTO();
	
	hs.setHospitalId("8552");
	hs.setHospitalName("HGK");
	hs.setHospitalLocation("vizagg");
	hs.setHospitalPhone("7894565121");
	return hs;
	
}
}
