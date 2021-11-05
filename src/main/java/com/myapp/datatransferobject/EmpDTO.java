package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmpDTO {
	
	private String empId;
	private String empName;
	
	private DepDTO depDto;
	

}
