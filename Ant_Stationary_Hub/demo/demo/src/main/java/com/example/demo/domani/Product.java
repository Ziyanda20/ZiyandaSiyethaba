package com.example.demo.domani;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
@Entity
public class Product {

	
	

		
		@Id
		private String productCode;
		private String productName;
		private Double productPrice;
		@Lob
		@Column(columnDefinition = "longblob")
		private byte[] productPicture;
		private Integer Quantity;

		public Product() {
		
		}
		public Product(String productCode,String productName, Double productPrice, byte[]  productPicture, Integer Quantity)
		{
			this.productCode = productCode;
			this.productName = productName;
			this.productPrice = productPrice;
			this.productPicture = productPicture;
			this.Quantity = Quantity;
		}
		
		public String getProductCode()
		{
			return productCode;
		}
		public String getProductName()
		{
			return productName;
		}
		public Double getProductPrice()
		{
			return productPrice;
		}
		public byte[]  getProductPicture()
		{
			return productPicture;
		}
		public Integer getQuantity()
		{
			return Quantity;
		}
		public void SetProductCode(String productCode)
		{
			this.productCode = productCode;
		}
		public void setProductName(String productName)
		{
			this.productName = productName;
		}
		public void setProductPrice(Double productPrice)
		{
			this.productPrice = productPrice;
		}
		public void setProductPicture(byte[]  productPicture)
		{
			this.productPicture = productPicture;
		}
		public void setQuantity(Integer Quantity)
		{
			this.Quantity = Quantity;
		}
		
		
		}

