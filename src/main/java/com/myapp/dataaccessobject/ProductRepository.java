package com.myapp.dataaccessobject;

import org.springframework.data.repository.CrudRepository;

import com.myapp.domainobject.ProductDO;

public interface ProductRepository extends CrudRepository<ProductDO, Long> {
	

}
