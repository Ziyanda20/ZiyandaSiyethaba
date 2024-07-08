package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domani.Admin;
import com.example.demo.domani.Product;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll()
	{
		return repo.findAll();
		
	}
	public void save(Product product)
	{
		repo.save(product);
	}
}
