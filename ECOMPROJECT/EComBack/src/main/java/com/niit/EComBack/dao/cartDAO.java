package com.niit.EComBack.dao;

import java.util.List;

import com.niit.EComBack.model.Cart;



public interface cartDAO {
	public boolean add(Cart cart);
	public boolean delete(Cart cart);
	public boolean update(Cart cart);
	public List<Cart> listCart(int cartId);
	public Cart getCart(int tId);

}
