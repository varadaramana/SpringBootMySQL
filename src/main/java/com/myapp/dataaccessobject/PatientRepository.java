package com.myapp.dataaccessobject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myapp.domainobject.PatientDO;



@Repository
public interface PatientRepository extends CrudRepository<PatientDO, Long> {
	

}
