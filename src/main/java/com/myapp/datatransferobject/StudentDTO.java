package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {
	
	private String stuId;
	private String name;
	private String classs;
	private String address;
	private String pincode;
}
