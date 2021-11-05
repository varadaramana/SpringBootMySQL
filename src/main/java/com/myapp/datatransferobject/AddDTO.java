package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddDTO {
	
	private String areaName;
	private String mandal;
	private String district;
	private String state;
	private String ph;
	private String pincode;
	
}
