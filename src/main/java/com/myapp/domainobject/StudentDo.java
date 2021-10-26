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
@Table(name = "StudentDetails")
@Data

public class StudentDo {

	@Id
	@GeneratedValue(generator = "HIBERNATE_SEQUENCE")
	@Column(name = "student_Id")
	private Long studentId;

	@Column(name = "student_Name")
	private String studentName;
	

	@Column(name = "student_Class")
	private Integer studentClass;

	@Column(name = "student_Roll")
	private Integer studentRoll;

	@Column(name = "student_Add")
	private String studentAdd;

	@Column(name = "student_Created")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private ZonedDateTime studentCreated = ZonedDateTime.now();

}
