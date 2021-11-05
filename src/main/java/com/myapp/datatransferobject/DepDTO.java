package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DepDTO {

	private String depId;
	private String depName;

	private AddDTO addDto;

}
