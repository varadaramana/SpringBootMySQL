package com.myapp.dataaccessobject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myapp.domainobject.StudentDo;

@Repository

public interface StudentRepository extends CrudRepository<StudentDo, Long> {

}
