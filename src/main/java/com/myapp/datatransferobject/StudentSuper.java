package com.myapp.datatransferobject;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StudentSuper {
	private List<StudentDTO> studentParent ;
	

}
