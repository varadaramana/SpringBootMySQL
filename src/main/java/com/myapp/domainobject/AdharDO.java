package com.myapp.domainobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "Adhar")
public class AdharDO {
	
	@Id
	@GeneratedValue
	@Column(name = "adhar_id")
	private Long adhrId;
	
	@Column(name = "adhar_name")
	private String adharName;
	
	@Column(name = "adhar_dob")
	private String adharDob;
	
	@Column(name = "adhar_address")
	private String adharAddress;
	
	@Column(name = "adhar_ph")
	private String adharPh;
	

	

}
