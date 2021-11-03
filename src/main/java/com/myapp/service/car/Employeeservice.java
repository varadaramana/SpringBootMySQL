package com.myapp.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.EmployeeDTO;
import com.myapp.datatransferobject.VillageDTO;

@Service
public class Employeeservice {
	
	@Autowired
	public Villagesevice villagesevice;

	public EmployeeDTO getEmployeeDTO() {
		
		VillageDTO vdto =villagesevice.getvillageDTO();
		
		EmployeeDTO edto = new EmployeeDTO();
		edto.setEmployeeId("23");
		edto.setEmployeeName("sai");
		edto.setEmployeePhone("987456123");
		edto.setEmployeePLace("srikakulam");
		edto.setVillagedto(vdto);
		return edto;
		
		
	}
}
