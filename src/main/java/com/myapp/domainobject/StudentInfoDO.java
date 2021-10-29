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
@Table(name = "StudentInfo")
public class StudentInfoDO {
	@Id
	@GeneratedValue
	@Column(name = "std_rollnum")
	private Long stdrollnum;
	
	@Column(name = "std_class")
	private String stdclass;
	 
	@Column(name = "std_section")
	private String stdsection;
	
	@Column(name = "std_name")
	private String stdname;
	
	@Column(name = "std_marks")
	private Integer stdmarks;
	
	@Column(name = "std_DTcreated")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private ZonedDateTime stdDTcreated = ZonedDateTime.now();
	
	
	
}