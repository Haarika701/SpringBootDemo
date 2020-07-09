package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dai.entities.Customer;
import com.example.demo.dai.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerservice ;
	
	@RequestMapping("/getAllCustomer")
	public List<Customer>  getAllCustomer()
	{
		return customerservice.getAllCustomer();
		
		
	}

}
