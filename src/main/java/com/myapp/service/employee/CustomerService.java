package com.myapp.service.employee;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.Address;
import com.myapp.datatransferobject.Customer;

@Service
public class CustomerService {

	@Autowired
	private Address1Service address1Service;

	public List<Customer> getcustomer(){
		
		List<Customer> list = new LinkedList<Customer>();
		Address address1 = address1Service.getAddress();
		Address address2 = address1Service.getaddress1();
		Customer cust1 = new Customer();
		cust1.setCustomerName("srinivas");
		cust1.setCustomerAge(18);
		cust1.setAddress(address1);
		Customer cust2 = new Customer();
		cust2.setCustomerName("guru");
		cust2.setCustomerAge(31);
		cust2.setAddress(address2);
		list.add(cust1);
		list.add(cust2);
		
		return list;
		

	}

}
