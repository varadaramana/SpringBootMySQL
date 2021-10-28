package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
//import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
public class WorkerDTO {
	
private Integer workerId;
private String workerName;
private String workerPlace;
private String workerPhone;
private String workergmail;
private String workerSalary;
}
