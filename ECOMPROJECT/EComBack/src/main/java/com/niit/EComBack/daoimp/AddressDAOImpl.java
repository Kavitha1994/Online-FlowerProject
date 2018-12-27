package com.niit.EComBack.daoimp;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.EComBack.dao.AddressDAO;
import com.niit.EComBack.model.Address;


@Repository("addressDAO")
@Transactional
public class AddressDAOImpl implements AddressDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean add(Address address) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(address);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(Address address) 
	{
		try 
		{
			sessionFactory.getCurrentSession().delete(address);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean update(Address address)
	{
		try 
		{
			sessionFactory.getCurrentSession().update(address);
			return true;
		} catch (Exception e) 
		{
			return false;
		}
	}

	@Override
	public Address getAddress(int addressid) 
	{
		Session session = sessionFactory.openSession();
		Query<Address> query = session.createQuery("from Address where addressId='"+addressid+"'");
		Address c=query.getSingleResult();
		session.close();
		return c;
	}

	@Override
	public List<Address> listAddress(int cartid) 
	{
		try 
		{
			return sessionFactory.getCurrentSession().createQuery("from Address where cartId="+cartid).list();
				
		}
		catch(Exception e)
		{
			return new ArrayList<Address>();
		}
	}

}
