package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AdharDTO {
	private String name;
	private String adharnum;
	private String adress;
	private String phnum;
	private String DOB;
	

}
