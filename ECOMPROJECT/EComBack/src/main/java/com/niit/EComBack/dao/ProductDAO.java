package com.niit.EComBack.dao;

import java.util.List;

import com.niit.EComBack.model.Product;

public interface ProductDAO {
	public boolean add(Product product);
	public boolean delete(Product product);
	public boolean update(Product product);
	public List<Product> listproduct();
	public Product getProduct(String productName);

}
