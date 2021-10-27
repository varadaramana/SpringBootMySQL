package com.myapp.domainobject;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "student")
@Data
	
public class StudentDO {
	@Id
	@GeneratedValue(generator = "HIBERNATE_SEQUENCE")
	@Column(name = "student_id")
	private Long studentId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "student_address")  
	private String studentAddress;
	
	@Column(name = "student_Ph")
	private String studentPh;
	
	@Column(name = "student_created")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private ZonedDateTime voterCreated = ZonedDateTime.now();
		
		
		

	

}
