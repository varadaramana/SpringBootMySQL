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
@Table(name = "voter")
@Data
public class VoterDO {
	
	@Id
	@GeneratedValue(generator = "HIBERNATE_SEQUENCE")
	@Column(name = "voter_id")
	private Long voterId;
	
	@Column(name = "voter_name")
	private String voterName;
	
	@Column(name = "voter_address")
	private String voterAddress;
	
	@Column(name = "voter_Ph")
	private String voterPh;
	
	@Column(name = "voter_created")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private ZonedDateTime voterCreated = ZonedDateTime.now();
	

}
