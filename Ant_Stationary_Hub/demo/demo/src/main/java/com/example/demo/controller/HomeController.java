package com.example.demo.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domani.Admin;
import com.example.demo.domani.Customer;
import com.example.demo.domani.Product;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.AdminService;
import com.example.demo.service.ProductService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

@Controller
public class HomeController {

@Autowired
 private AdminService adminRepo;
@Autowired
private ProductService pro;
@Autowired
private ProductRepository proR;
@Autowired
private CustomerRepository custo;
	@GetMapping("/")
	public String homeP()
	{
		return "home.html";
	}
	

	@GetMapping("/register")
	public String regester()
	{
		return "register";
	}
	@GetMapping("/display")
	public String display()
	{
		return "display.jsp";
	}
	
	@GetMapping("/addProduct")
	public String addProduct()
	{
		return "addProduct";
	}
	
	 @PostMapping("/reg")
	public String addRegister(
	        @RequestParam("adminNo") String adminnum,
	        @RequestParam("name") String name,
	        @RequestParam("surname") String surname,
	        @RequestParam("username") String username,
	        @RequestParam("password") String password) {

	        Admin admin = new Admin(adminnum, name, surname, username, password);
	        adminRepo.save(admin);
	        
	        return "redirect:/home.html"; 
	    }
	 
	 @PostMapping("/delete-form")
		public String delete(
		        @RequestParam("adminNo") String adminnum
		       ) {

		        proR.deleteById(adminnum);
		     
		        
		        return "redirect:/menu.html"; 
		    }
	 @PostMapping("/login_form")
	 public String login( @RequestParam("username") String adminnum,
			 				@RequestParam("password") String password,
			 				HttpServletRequest request)throws IOException, ServletException
	 {
		
		
		 String url = "redirect:/home.html";
		 String user = "12345ts";
		 String pass = "12345";
		 List<Admin> list;
		 list = adminRepo.listAll();
		 
		
		 for(int y=0; y<list.size(); y++)
			 {
			
			 
			  if(adminnum.equals(list.get(y).getAdminNum()) && password.equals(list.get(y).getPassword()))
				 {
					 
				  	url = "redirect:/menu.html";
					 
					
				 }
			 }
		 
		 
		 return url;
	 }
	 
	 @PostMapping("/add")
	 public String addPro( @RequestParam("productCode") String proCode,
		        @RequestParam("productName") String proName,
		        @RequestParam("productPrice") Double proPrice,
		        @RequestParam("productPicture")MultipartFile proPic,
		        @RequestParam("quantity") Integer quantity) throws IOException
	 {

		 byte[] image = proPic.getBytes();
		 
		 Product product = new Product(proCode,proName,proPrice,image,quantity);
		 
		 pro.save(product);
		 
		 return "redirect:/menu.html";
	 }
	


}
