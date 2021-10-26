package com.myapp.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.dataaccessobject.StudentRepository;
import com.myapp.datatransferobject.StudentDTO;
import com.myapp.domainobject.StudentDo;

@Service

public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	

	public StudentDTO saveStudentDetails(StudentDTO dto) {

		StudentDo studentDo = new StudentDo();
		studentDo.setStudentId(dto.getStudentId());
		studentDo.setStudentName(dto.getStudentName());
		studentDo.setStudentClass(dto.getStudentClass());
		studentDo.setStudentRoll(dto.getStudentRoll());
		studentDo.setStudentAdd(dto.getStudentAdd());
		
		studentRepository.save(studentDo);
		return null;
	}
}

