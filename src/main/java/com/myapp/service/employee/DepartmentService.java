package com.myapp.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.AddressDTO;
import com.myapp.datatransferobject.Department1DTO;

@Service
public class DepartmentService {
	
	@Autowired
	private AddressService addressService;
	
	public Department1DTO getdepartment1DTO() {
		
		AddressDTO addDTO = addressService.getAddressDTO();
		Department1DTO deptDTO = new Department1DTO();
		deptDTO.setDeptName("IT");
		deptDTO.setDeptNum(12121);
		deptDTO.setDeptType("Software");
		deptDTO.setDeptAdd("hyd");
		deptDTO.setAddressDTO(addDTO);
				
		return deptDTO;
		
	}

}
