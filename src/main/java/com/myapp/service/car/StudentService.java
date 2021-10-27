package com.myapp.service.car;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.dataaccessobject.StudentRepository;
import com.myapp.datatransferobject.StudentDTO;
import com.myapp.datatransferobject.StudentSuper;
import com.myapp.domainobject.StudentDO;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
		
	
	
	public StudentDTO saveStudentDo(StudentSuper dto) {
		
		 List<StudentDTO> studentDTO= dto.getStudentParent();
	
		 for (StudentDTO stu1 : studentDTO) {
			 	 StudentDO sm = new StudentDO();
				 sm.setStudentName(stu1.getStudentName());
				 sm.setStudentAddress(stu1.getStudentAddress());
				 sm.setStudentPh(stu1.getStudentPh());
				 studentRepository.save(sm);
			 
		 }
			return null;
}
	public StudentDTO getStudentDTO(String studentid) {
		Optional<StudentDO> studentdo = studentRepository.findById(Long.valueOf(studentid));
		StudentDO doObj = studentdo.get();
		
		StudentDTO dto = new StudentDTO();
		dto.setStudentId(doObj.getStudentId().toString());
		dto.setStudentName(doObj.getStudentName());
		dto.setStudentAddress(doObj.getStudentAddress());
		dto.setStudentPh(doObj.getStudentPh());
		
		return dto;
	
	}
}
