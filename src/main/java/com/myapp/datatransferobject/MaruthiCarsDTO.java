package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaruthiCarsDTO {	
	private String name;
	private String model;
	private String colour;
	private String fuel;
	private String price;
	

}
