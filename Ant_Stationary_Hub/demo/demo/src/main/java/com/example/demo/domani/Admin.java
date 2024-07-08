package com.example.demo.domani;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {

	
	@Id
	private String adminNum;
	private String name;
	private String surname;
	private String username;
	private String password;

	public Admin()
	{
		
	}

	public Admin(String adminNum, String name, String surname, String username, String password)
	{
		this.adminNum = adminNum;
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
	}
	public String getAdminNum()
	{
		return adminNum;
	}
	public String getName()
	{
		return name;
	}
	public String getSurname()
	{
		return surname;
	}
	public String getUsername()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setAdminNum(String adminNum)
	{
		this.adminNum = adminNum;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	}

