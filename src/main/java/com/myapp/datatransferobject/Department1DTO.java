package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Department1DTO {
	
	private String deptName;
	private Integer deptNum;
	private String deptAdd;
	private String deptType;
	private AddressDTO addressDTO;
	
	
	

}
