package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class HospitalDTO {

	private String hospitalId;
	private String hospitalName;
	private String hospitalLocation;
	private String hospitalPhone;
		
	
	
}
