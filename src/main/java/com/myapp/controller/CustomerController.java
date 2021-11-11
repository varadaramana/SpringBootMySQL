package com.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.datatransferobject.Customer;
import com.myapp.service.employee.CustomerService;

@RestController
@RequestMapping("/manchalaSrinivas")

public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/manchalaGuru")
	public List<Customer> customer(){
		List<Customer> list1 = customerService.getcustomer();
		return list1;
		
	}

}
