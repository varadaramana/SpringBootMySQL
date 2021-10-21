package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankDTO {
	
	private String Bankid;
	private String Bankname;
	private String Branch;
	private String Address;
	private String Pincode;
	

}
