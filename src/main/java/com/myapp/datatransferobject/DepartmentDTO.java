package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class DepartmentDTO{
	
	private String DeptId;
	private String DeptNum;
	private String DeptAdd;
	private String DeptPh;
	
}
 

