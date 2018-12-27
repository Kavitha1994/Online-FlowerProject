package com.niit.EComBack;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.EComBack.dao.ProductDAO;

import com.niit.EComBack.model.Product;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DBConfig.class)

public class product {
	@Autowired
	ProductDAO productDAO;
	Product p=new Product();
	
	@Before
	public void setUp() throws Exception {
		p.setProductName("carnation");
		p.setProductDesc("rose flower varieties");
		p.setPrice(800);
		p.setQuantity(800);
	}

	@After
	public void tearDown() throws Exception {
		//productDAO.delete(productDAO.getProduct("aster1"));
	}

	@Test
	public void test() {
		//productDAO.delete(p);
		//assertEquals("success",true,productDAO.add(p));
		//productDAO.add(p);
		//List<Product>list=productDAO.listproduct();
		//Product c=productDAO.getProduct("carnation");
		//assertTrue("success",list.size()>0);
		//assertTrue("success",c!=null);
		//c.setProductName("aster1");
		//productDAO.update(c);
		//Product c1=productDAO.getProduct("aster1");
		//assertTrue("success",c1.getProductName().equals("aster1"));
					
	}

}
