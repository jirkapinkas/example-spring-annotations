package com.test.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Customer;

@Service
public class InitDbService {

	@Autowired
	private CustomerService customerService;

	@PostConstruct
	public void init() {
		{
			Customer customer = new Customer();
			customer.setName("Jirka");
			customerService.save(customer);
		}
		{
			Customer customer = new Customer();
			customer.setName("Michal");
			customerService.save(customer);
		}
	}
}
