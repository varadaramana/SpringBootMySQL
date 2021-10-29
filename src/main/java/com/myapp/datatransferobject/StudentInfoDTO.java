package com.myapp.datatransferobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentInfoDTO {

	private String stdrollnum;
	private String stdclass;
	private String stdsection;
	private String stdname;
	private Integer stdmarks;

}
