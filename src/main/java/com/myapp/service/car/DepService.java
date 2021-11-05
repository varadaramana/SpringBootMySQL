package com.myapp.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.AddDTO;
import com.myapp.datatransferobject.DepDTO;

@Service
public class DepService {
	
	@Autowired
	private AddService addService;
	
	public DepDTO getDepDTO() {
		AddDTO ado = addService.getAddDTO();
		DepDTO dto1 = new DepDTO();
		dto1.setDepId("1001");
		dto1.setDepName("kiran");
        dto1.setAddDto(ado);
		return dto1;
		
		
	}

}
