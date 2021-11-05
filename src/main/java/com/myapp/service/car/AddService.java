package com.myapp.service.car;

import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.AddDTO;

@Service
public class AddService {
	
	public AddDTO getAddDTO() {
		AddDTO dto = new AddDTO();
		dto.setAreaName("pedakallepalli");
		dto.setMandal("mopidevi");
		dto.setDistrict("krishna");
		dto.setState("AndhraPradesh");
		dto.setPincode("500049");
		dto.setPh("987654321");
		
		return dto;
		
	}
	
	

}
