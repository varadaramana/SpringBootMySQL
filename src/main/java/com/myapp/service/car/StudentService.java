package com.myapp.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.dataaccessobject.StudentRepository;
import com.myapp.datatransferobject.StudentInfoDTO;
import com.myapp.domainobject.StudentInfoDO;

import lombok.Data;

@Data
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public StudentInfoDO savestudentinfo(StudentInfoDTO stdinfo) {
		StudentInfoDO std = new StudentInfoDO();
		/* std.setStdrollnum(stdinfo.getStdrollnum()); */
		std.setStdclass(stdinfo.getStdclass());
		std.setStdsection(stdinfo.getStdsection());
		std.setStdname(stdinfo.getStdname());
		std.setStdmarks(stdinfo.getStdmarks());
		
		StudentInfoDO std1 = studentRepository.save(std);

		return std1;
	}
}
