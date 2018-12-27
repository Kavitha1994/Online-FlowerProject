package com.niit.EComBack;
import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.EComBack.dao.UserDetailDAO;
import com.niit.EComBack.model.UserDetail;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DBConfig.class)

public class userdetail {
@Autowired
	
UserDetailDAO userdetaildao;
	
UserDetail p=new UserDetail();
@Before
public void setUp() throws Exception
{
	p.setUserName("nivi");
	p.setPassword("jkjd");
	p.setEmailId("n2@gmail.com");
	p.setMobileNo("878");
	
	
}	@After
public void tearDown() throws Exception {
	//userdetaildao.deleteuser("");
}
@Test
public void test() {

//assertEquals("success",true,userdetaildao.adduser(p));
//List<UserDetail>list=userdetaildao.listUserDetail();
//UserDetail c=userdetaildao.getUserDetail("flower");
//assertTrue("success",list.size()>0);
//assertTrue("success",c!=null);
//c.setUserName("roses");
//userdetaildao.update(c);
userdetaildao.adduser(p);
UserDetail c1=userdetaildao.getUserDetail("n2@gmail.com");
assertTrue("success",c1.getEmailId().equals("n2 @gmail.com"));	

}
}