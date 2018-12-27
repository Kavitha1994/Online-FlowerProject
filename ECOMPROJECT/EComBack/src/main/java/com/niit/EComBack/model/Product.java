package com.niit.EComBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int productId;
	
	@Column(unique = true, nullable = false)
	@NotEmpty(message = "Product Name cannot be blank")
	String productName;
	
	@Column(nullable = false)
	@NotEmpty(message = "Product Description cannot be blank")
	String productDesc;

	@Min(value = 200, message = "price must be greater than 200")
	@Column(nullable = false)
	int price;
	
	
	@Column(nullable = false)
	int quantity;
	
	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Category category;
	
	
	@Transient
	MultipartFile pimage;


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDesc() {
		return productDesc;
	}


	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public MultipartFile getPimage() {
		return pimage;
	}


	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}


}
