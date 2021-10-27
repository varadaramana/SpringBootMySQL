package com.myapp.domainobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "patient")
@Data
public class PatientDO {
	
	@Id
	@GeneratedValue(generator = "HIBERNATE_SEQUENCE")
	@Column(name = "patiend_id")
	private Long patientid;
	
	@Column(name = "patient_name")
	private String patientname;
	
	@Column(name = "patient_address")
	private String patientaddress;
	
	@Column(name = "patient_ph")
	private String patientph;
	
	@Column(name = "patient_disease")
	private String patientdisease;
	
	
	

}
