package com.myapp.dataaccessobject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myapp.domainobject.StudentDO;


@Repository
public interface StudentRepository extends CrudRepository<StudentDO, Long> {

}
