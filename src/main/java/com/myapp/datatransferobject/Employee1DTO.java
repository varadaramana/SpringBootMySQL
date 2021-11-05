package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee1DTO {

	private Integer empId;
	private String empName;
	private Long empSalary;
	private String empType;
	private Long empPhoneNum;
	private Department1DTO department1DTO;
	private AddressDTO addressDTO;
	
	
	
}
