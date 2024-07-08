package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domani.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminService {

	
	@Autowired
	private AdminRepository repo;
	
	public List<Admin> listAll()
	{
		return repo.findAll();
		
	}
	public void save(Admin admin)
	{
		repo.save(admin);
	}
}
