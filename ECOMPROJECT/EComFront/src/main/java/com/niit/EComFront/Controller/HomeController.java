package com.niit.EComFront.Controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.EComBack.dao.UserDetailDAO;
import com.niit.EComBack.model.UserDetail;
@Controller
public class HomeController {
@Autowired
JavaMailSender jms;

@Autowired
UserDetailDAO userDetailDAO;
@RequestMapping(value = "sendmail")
	public String sendmail(HttpServletRequest request) {
		try {
			String recipientAddress = "onlineflowerparadise@gmail.com";
			String uname = request.getParameter("name");
			String uemail = request.getParameter("email");
			String uphno = request.getParameter("phno");
			String umessage = request.getParameter("message");
			String finalmessage = "Hi Admin, " + umessage + " Contact me in:" + uphno + "\n\n\nregards\n\n\n" + uname;
			SimpleMailMessage email = new SimpleMailMessage();
			email.setTo(recipientAddress);
			email.setSubject("New request from"+uname);
			email.setText(finalmessage);
			jms.send(email);
			
			System.out.println("error");
			String finalmessage1 = "Thank you  \n\n\n regards  \nFlowerparadise Admin\n";
			SimpleMailMessage email1 = new SimpleMailMessage();
			email1.setTo(uemail);
			email1.setSubject(uemail);
			email1.setText(finalmessage1);
			jms.send(email1);
			} 
		catch (Exception e)
		{

		}
		return "redirect:/contactus";
	}

	@RequestMapping({ "/", "/index" })
	public String indexPage(Model m)
	{
		m.addAttribute("title","Flower Paradise -Home");
		m.addAttribute("sliderpage", true);
		return "index";
	}

	@RequestMapping("/aboutus")
	public String aboutPage(Model m) {
		m.addAttribute("title","Flower Paradise -About");
		m.addAttribute("aboutPage", true);
		return "index";
	}

	@RequestMapping("/contactus")
	public String contactPage(Model m) {
		m.addAttribute("title","Flower Paradise -Contact");
		m.addAttribute("contactPage", true);
		return "index";

	}
	@RequestMapping("/Login")
	public String loginPage(Model m)
	{
		m.addAttribute("title","Flower Paradise -Login");
		m.addAttribute("error","false");
		m.addAttribute("message","");
		m.addAttribute("loginPage", true);
		return "index";

	}

	@RequestMapping("/flogin")
	public String errorloginpage(Model m) {
		m.addAttribute("error", true);
		m.addAttribute("loginPage", true);
		
		m.addAttribute("message","pls check");
		m.addAttribute("title","Flower Paradise -Loginerror");
		return "index";
	}
	@RequestMapping("/loginsuccess")
	public String isLoggedin(HttpSession session)
	{
		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		for (GrantedAuthority authority : authorities)
		{
			if (authority.getAuthority().equals("ROLE_USER"))
			{
				UserDetail customer = userDetailDAO.getUserDetail(email);
				session.setAttribute("useremail", customer.getEmailId());
				session.setAttribute("usercartid", customer.getCartId());
				session.setAttribute("username",customer.getUserName());
				session.setAttribute("userlogin", true);
				if(session.getAttribute("proid")!=null)
				{
					return "redirect:/addToCart?productName="+session.getAttribute("proname").toString();
				}
				else
				{
			
					return "redirect:/";
				}
			}
			else
			{
				session.setAttribute("username","Administrator");
				session.setAttribute("userlogin", false);
				return "redirect:/";
			}
		}
		return "redirect:/";
		
	}

	}
