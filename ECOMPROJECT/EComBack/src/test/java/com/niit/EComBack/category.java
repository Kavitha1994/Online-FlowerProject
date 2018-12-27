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

import com.niit.EComBack.dao.CategoryDAO;
import com.niit.EComBack.model.Category;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DBConfig.class)
public class category {

	@Autowired
	
    CategoryDAO categorydao;
	//Category p=categorydao.getCategory(2);
	Category p=new Category();
	
	@Before
	public void setUp() throws Exception
	{
		p.setCategoryName("carnation44");
		p.setCategoryDesc("vareity of flowers44");
		//p.setCategoryDesc("new description");
	
	}

	@After
	public void tearDown() throws Exception {
		categorydao.delete(p);
	}
	
	@Test
	public void test() {
			//assertEquals("success",true,categorydao.add(p));
			categorydao.add(p);
			List<Category>list=categorydao.listCategories();
			Category c=categorydao.getCategory("flower");
			assertTrue("success",list.size()>0);
			assertTrue("success",c!=null);
			c.setCategoryName("roses");
			categorydao.update(c);
			Category c1=categorydao.getCategory("roses");
			assertTrue("success",c1.getCategoryName()=="roses");	
			
	}

}
