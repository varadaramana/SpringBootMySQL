package com.myapp.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.AddressDTO;
import com.myapp.datatransferobject.Department1DTO;
import com.myapp.datatransferobject.Employee1DTO;

@Service
public class EmployeeService {

	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private AddressService addressService;

	public Employee1DTO getemployee1DTO() {
		Employee1DTO empDTO1 = new Employee1DTO();
		Department1DTO deptDto = departmentService.getdepartment1DTO();
		AddressDTO addempdto = addressService.getempAddressDTO();
		empDTO1.setEmpId(1021);
		empDTO1.setEmpName("srinivas manchala");
		empDTO1.setEmpPhoneNum(9553336737L);
		empDTO1.setEmpSalary(10000L);
		empDTO1.setEmpType("PVT");
		empDTO1.setDepartment1DTO(deptDto);
		empDTO1.setAddressDTO(addempdto);
		return empDTO1;

	}

}
