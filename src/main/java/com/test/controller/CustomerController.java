package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;
import com.test.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping
	public List<Customer> findAll() {
		return customerService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Customer findOne(@PathVariable int id) {
		return customerService.findOne(id);
	}
}
