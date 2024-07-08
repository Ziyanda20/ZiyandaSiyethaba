package com.example.demo.domani;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Customer {

		@GeneratedValue(strategy = GenerationType.AUTO)
		@Id
		private int orderNum;
		private String name;
		private String surname;
		private String address;
		private int phoneNumber;

		public Customer()
		{
			
		}

		public Customer(String name, String surname, String address, int phoneNumber)
		{
		
			this.name = name;
			this.surname = surname;
			this.address = address;
			this.phoneNumber = phoneNumber;
		}
		public int getOrderNum()
		{
			return orderNum;
		}
		public String getName()
		{
			return name;
		}
		public String getSurname()
		{
			return surname;
		}
		public String getAddress()
		{
			return address;
		}
		public int getPhoneNumber()
		{
			return phoneNumber;
		}
		public void setOrderNum(int orderNum)
		{
			this.orderNum = orderNum;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public void setSurname(String surname)
		{
			this.surname = surname;
		}
		public void setUsername(String address)
		{
			this.address = address;
		}
		public void setPhoneNumber(int phoneNumber)
		{
			this.phoneNumber = phoneNumber;
		}
		}


