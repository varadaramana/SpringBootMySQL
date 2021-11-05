package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddressDTO {
	
	private Integer empDoorNum;
	private String empStreet;
	private String empVillage;
	private String empTown;
	private String empState;
	private Integer empPincode;
	
	

}
