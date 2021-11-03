package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SectionDTO {

	private String sectionId;
	private String sectionName;
	private String sectionPhone;
	private String sectionPlace;
	
		private EmployeeDTO employeedto;
}
