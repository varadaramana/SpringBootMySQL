package com.myapp.domainobject;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "EmployeeDetails")

public class EmployeeDO {
	
	@Id
	@GeneratedValue(generator = "HIBERNATE_SEQUENCE")
	@Column(name = "employeeId")
	private Long employeeId;
	
	@Column(name = "employeeName")
	private String employeeName;
	
	
	@Column(name = "employeeNo")
	private Integer employeenNo;
	
	@Column(name = "employeeAdd")
	private String employeeAdd;
	
	@Column(name = "employeeCreated")
	@DateTimeFormat
	private ZonedDateTime employeeCreated;
	
	
	
	
	
	

}
