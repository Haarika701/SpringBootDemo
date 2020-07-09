package com.example.demo.dai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dai.entities.Customer;
import com.example.demo.dai.repos.CustomerRepos;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	
	CustomerRepos customerrepos;
	
	@Override
	public List<Customer>getAllCustomer() {
		return customerrepos.findAll();
	}
	

}
