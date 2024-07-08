package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domani.Admin;
import com.example.demo.domani.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;

@Controller
public class HomeControllerB {

	@Autowired
	private CustomerRepository repo;
	@Autowired
	private CustomerService ser;
	
	@GetMapping("/homes")
	public String homeP()
	{
		
		
		return "homes.html";
	}
	@GetMapping("/browser")
	public String homePh()
	{
		
		
		
		return "browser.html";
	}
	 @PostMapping("/contact-form")
		public String delete(
		        @RequestParam("name") String name,
		        @RequestParam("surname") String surname,
		        @RequestParam("phone") int phoneNum,
		        @RequestParam("address") String address) {

		   Customer admin = new Customer(name, surname, address, phoneNum);
	        repo.save(admin);
	        
	        return "redirect:/browser.html";
		     
		    }
	 
	 @GetMapping("/check.html")
	 public ModelAndView getData()
	 {
		 List<Customer> proList = ser.listAll();
		 
		 ModelAndView dataaa = new ModelAndView("display.jsp");
		 dataaa.addObject("prod", proList);
		 return dataaa;
	 }
}
