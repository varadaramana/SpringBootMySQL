package com.myapp.domainobject;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "Worker")
@Data
public class WorkerDO {

	@Id
	@GeneratedValue(generator = "HIBERNATE_SEQUENCE")
	@Column(name = "worker_Id")
	private Integer workerId;

	@Column(name = "worker_Name")
	private String workerName;

	@Column(name = "worker_Place")
	private String workerPlace;

	@Column(name = "worker_phone")
	private String workerPhone;

	@Column(name = "worker_Gmail")
	private String workerGmail;

	@Column(name = "worker_Salary")
	private String workerSalary;

	@Column(name = "worker_created")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private ZonedDateTime workercreated = ZonedDateTime.now();

}
