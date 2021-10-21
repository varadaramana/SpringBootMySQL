package com.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.CoustomerDTO;

@RestController
@RequestMapping("/v1/coustomer")
public class CoustomerController {
	
	@GetMapping("/custId")
	public CoustomerDTO getCoustomer() {
		return new CoustomerDTO("10","masoom","kurnool","p.masoombasha@gmail.com","8897897491");
		
	}
	@GetMapping("/custId/Noargs")
    public CoustomerDTO getCoustomerNoargs() {
    	
    	CoustomerDTO cdto = CoustomerDTO.builder().custId("20").custName("ramana").address("hyderabad").email("ramana@gmail.com")
				.phoneNumber("7093606547").build();
		return cdto;
    	
    }
	
public CoustomerDTO getCoustomerSetters() {
	
	CoustomerDTO edto = new CoustomerDTO();
           edto.setCustId("30");
           edto.setCustName("masoombasha");
           edto.setAddress("vizag");
           edto.setEmail("masoombasha545@gmail.com");
           edto.setPhoneNumber("9703291310");
	
	
	return edto;
}
	
	
	
	
}
