package com.myapp.dataaccessobject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myapp.domainobject.VoterDO;

@Repository
public interface VoterRepository extends CrudRepository<VoterDO, Long> {

}
