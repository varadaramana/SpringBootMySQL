package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankEmpDetails {
	
	private String Eid;
	private String name;
	private String pnumber;
	private String salary;
	private String adress;
	
	

}
