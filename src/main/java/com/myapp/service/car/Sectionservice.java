package com.myapp.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.EmployeeDTO;
import com.myapp.datatransferobject.SectionDTO;

@Service
public class Sectionservice {
	
	@Autowired
	public Employeeservice employeeservice;
	public SectionDTO getSectionDTO() {
		
		EmployeeDTO edto =employeeservice.getEmployeeDTO();
		
		SectionDTO sdto = new SectionDTO();
		sdto.setSectionId("103");
		sdto.setSectionName("seshu");
		sdto.setSectionPhone("7286881485");
		sdto.setSectionPlace("vzm");
		sdto.setEmployeedto(edto);
		return sdto;
	}
}
