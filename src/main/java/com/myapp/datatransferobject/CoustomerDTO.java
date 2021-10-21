package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CoustomerDTO {
	
	private String custId;
	private String custName;
	private String address;
	private String email;
	private String phoneNumber;
	
	
	

}
