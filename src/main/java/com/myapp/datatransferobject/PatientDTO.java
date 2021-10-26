package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientDTO {

	private String patientId;
	private String patientName;
	private String patientPlace;
	private String patientPhone;
	private String patientGmail;
	
}
