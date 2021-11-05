package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AdharDTO {
	
	  private String adharId;
	  private String adharName;
	  private String adharPh;
	  private String adharDob;
	  private String adharAddress;
	  private String adharPincode;
	  
	  private EmpDTO empDto;
	  
	  
	 
}