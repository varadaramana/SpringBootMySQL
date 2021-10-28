package com.myapp.dataaccessobject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.myapp.domainobject.WorkerDO;

@Repository
	public interface WorkerRepository extends CrudRepository<WorkerDO, Integer> {
			
}
