package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

	private String employeeId;
	private String employeeName;
	private String employeePhone;
	private String employeePLace;
	
	private VillageDTO villagedto;
}
