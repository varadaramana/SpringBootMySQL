package com.myapp.dataaccessobject;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import com.myapp.domainobject.EmployeeDO;

public interface EmployeeRepository extends CrudRepository<EmployeeDO, Id> {

}
