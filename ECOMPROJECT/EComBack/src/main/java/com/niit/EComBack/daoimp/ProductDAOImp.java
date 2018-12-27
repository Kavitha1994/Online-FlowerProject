package com.niit.EComBack.daoimp;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.EComBack.dao.ProductDAO;
import com.niit.EComBack.model.Category;
import com.niit.EComBack.model.Product;
@Repository("productDAO")
@Transactional
public class ProductDAOImp implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	ProductDAO productDAO;
		@Override
		public boolean add(Product product) {
			try{
				sessionFactory.getCurrentSession().save(product);
				return true;
			}
			catch(Exception e) {
				return false;
			}
		}

	@Override
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		try{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e) {
			return false;
		}}
	
	@Override
	public List<Product> listproduct() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query<Product> query=session.createQuery("from Product");
		List<Product>listproduct=query.list();
		session.close();
		return listproduct;
	}
	@Override
	public Product getProduct(String productName) {
		try
		{
		Session session = sessionFactory.openSession();
		Product c=(Product)session.createCriteria(Product.class).add(Restrictions.eq("productName",productName)).uniqueResult();
		//Query<Product> query = session.createQuery("from Product where productName='"+productName+"'");
		//Product c=query.getSingleResult();
		session.close();
		return c;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
			// TODO: handle exception
		}
	
	}
	

}
