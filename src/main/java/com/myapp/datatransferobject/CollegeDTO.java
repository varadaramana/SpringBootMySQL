package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CollegeDTO {
	
	private String collegeId;
	private String collegeName;
	private String collegeLoc;
	private String collegeDistrict;
	private String collegePh;
	
	
}
