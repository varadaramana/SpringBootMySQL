package com.myapp.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.DepDTO;
import com.myapp.datatransferobject.EmpDTO;

@Service
public class EmpService {

	@Autowired
	private DepService depService;

	public EmpDTO getempDTO() {
		DepDTO ddto = depService.getDepDTO();
		EmpDTO edto = new EmpDTO();

		edto.setEmpId("111");
		edto.setEmpName("kiran");
		edto.setDepDto(ddto);

		return edto;

	}
}
