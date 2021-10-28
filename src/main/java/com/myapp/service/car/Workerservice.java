package com.myapp.service.car;

import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.dataaccessobject.WorkerRepository;
import com.myapp.datatransferobject.WorkerDTO;
import com.myapp.domainobject.WorkerDO;

@Service
public class Workerservice {
	
	@Autowired
	private WorkerRepository workerRepository;
	public WorkerDO saveWorObject(WorkerDTO dto) {
		WorkerDO dowor = new WorkerDO();
		//dowor.setWorkerId(dto.getWorkerId(Long.val)));
		dowor.setWorkerName(dto.getWorkerName());
		dowor.setWorkerPlace(dto.getWorkerPlace());
		dowor.setWorkerPhone(dto.getWorkerPhone());
		dowor.setWorkerGmail(dto.getWorkergmail());
		dowor.setWorkerSalary(dto.getWorkerSalary());
		dowor.setWorkercreated(ZonedDateTime.now());
		
		WorkerDO dowor1 = workerRepository.save(dowor);
		
		return dowor1;
		
	}

}
