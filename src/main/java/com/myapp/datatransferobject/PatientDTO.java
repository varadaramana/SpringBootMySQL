package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PatientDTO {
	
	private String patientId;
	private String patientName;
	private String patientAddress;
	private String patientPh;
	private String patientDisease;
	
	

}
