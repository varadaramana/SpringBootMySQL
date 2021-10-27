package com.myapp.service.car;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.dataaccessobject.PatientRepository;
import com.myapp.datatransferobject.PatientDTO;
import com.myapp.datatransferobject.PatientParent;
import com.myapp.domainobject.PatientDO;

@Service
public class PatientServise {
	
	@Autowired
	private PatientRepository patientRepository;
	
	public PatientDTO savePatientDo(PatientParent dt1) {
		List<PatientDTO> patientDTO =dt1.getPatientParent();
		
		for (PatientDTO pat1 : patientDTO) {
			PatientDO do1 = new PatientDO();
			do1.setPatientname(pat1.getPatientName());
			do1.setPatientaddress(pat1.getPatientAddress());
			do1.setPatientph(pat1.getPatientPh());
			do1.setPatientdisease(pat1.getPatientDisease());
			patientRepository.save(do1);
		}
		 return null;

}
	public PatientDTO getPatientDTO(String patientid) {
		Optional<PatientDO> patientdo = patientRepository.findById(Long.valueOf(patientid));
		PatientDO doObj = patientdo.get();
		
		PatientDTO dto = new PatientDTO();
		dto.setPatientId(doObj.getPatientid().toString());
		dto.setPatientName(doObj.getPatientname());
		dto.setPatientAddress(doObj.getPatientaddress());
		dto.setPatientPh(doObj.getPatientph());
		dto.setPatientDisease(doObj.getPatientdisease());
		
		return dto;
	
}
}

