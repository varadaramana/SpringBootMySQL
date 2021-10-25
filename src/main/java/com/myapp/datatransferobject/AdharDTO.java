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
	private String adharId;
	private String adharName;
	private String adharDob;
	private String adharAddress;
	private String adharPh;
	

}
