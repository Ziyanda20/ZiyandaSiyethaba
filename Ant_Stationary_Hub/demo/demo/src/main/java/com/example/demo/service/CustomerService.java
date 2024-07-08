package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domani.Admin;
import com.example.demo.domani.Customer;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll()
	{
		return repo.findAll();
		
	}
	
}
