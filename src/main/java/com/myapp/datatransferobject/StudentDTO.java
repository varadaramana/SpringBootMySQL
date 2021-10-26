package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
	private Long studentId;
	private String studentName;
	private Integer studentClass;
	private Integer studentRoll;
	private String studentAdd;

}
