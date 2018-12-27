package com.niit.EComBack.daoimp;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.EComBack.dao.OrderDAO;
import com.niit.EComBack.model.Orders;

@Repository("orderDAO")
@Transactional
public class OrderDAOImpl implements OrderDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean add(Orders order)
	{
		try 
		{
			sessionFactory.getCurrentSession().save(order);
			return true;
		} 
		catch (Exception e)
		{
			return false;
		}
	}

	@Override
	public Orders getOrder(String orderid) 
	{
		Session session = sessionFactory.openSession();
		Query<Orders> query = session.createQuery("from Orders where orderid='"+orderid+"'");
		Orders c=query.getSingleResult();
		session.close();
		return c;
	}


		@Override
		public List<Orders> listOrder(int cartid) 
		{
			try 
			{
				return sessionFactory.getCurrentSession().createQuery("from Orders where cartid="+cartid).list();
					
			}
			catch(Exception e)
			{
				return new ArrayList<Orders>();
			}
		}

}
