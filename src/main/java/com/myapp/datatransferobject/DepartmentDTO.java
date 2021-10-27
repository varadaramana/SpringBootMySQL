package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentDTO {

	private String departmentId;
	private String departmentName;
	private String departmentPlace;
	private String departmentPhone;
	private String departmentGmail;
	private String departmentSalary;
	
}
