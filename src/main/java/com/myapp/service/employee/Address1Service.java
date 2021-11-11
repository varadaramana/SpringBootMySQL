package com.myapp.service.employee;

import org.springframework.stereotype.Service;

import com.myapp.datatransferobject.Address;

@Service
public class Address1Service {

	public Address getAddress() {
		Address add1 = new Address();
		add1.setDoorNumber(401);
		add1.setStreet("dibbapalem");
		add1.setVillage("Aga");
		add1.setCity("vizag");
		return add1;

	}

	public Address getaddress1() {
		Address add2 = new Address();
		add2.setDoorNumber(402);
		add2.setStreet("bc colony");
		add2.setVillage("gaju");
		add2.setCity("hyd");

		return add2;
	}

}
