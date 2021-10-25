package com.myapp.service.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.dataaccessobject.VoterRepository;
import com.myapp.datatransferobject.VoterDTO;
import com.myapp.domainobject.VoterDO;

@Service
public class VoterService {
	
	@Autowired
	private VoterRepository voterRepository;
	
	public VoterDO saveVoterObject(VoterDTO dto) {
		
	
		VoterDO dovoter = new VoterDO();
		dovoter.setVoterName(dto.getVoterName());
		dovoter.setVoterAddress(dto.getVoterAddress());
		dovoter.setVoterPh(dto.getVoterPh());
		
		VoterDO dovoter1= voterRepository.save(dovoter);
		return dovoter1;
		
	
	
	
	
	}
}
