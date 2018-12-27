package com.niit.EComFront.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.EComBack.dao.CategoryDAO;
import com.niit.EComBack.dao.ProductDAO;
import com.niit.EComBack.model.Product;


@Controller
public class ProductController {
	@Autowired
	ProductDAO productDAO;
	@Autowired
	CategoryDAO categoryDAO;

	void addimage(MultipartFile f, int id) {
		try {
			String path = "F:\\ECOMPROJECT\\EComFront\\src\\main\\webapp\\resources\\productimage\\";//location that u copied
			path = path + String.valueOf(id) + ".jpg";
			if (!f.isEmpty()) {
				byte[] imagebytes = f.getBytes();
				File x = new File(path);
				if (x.exists()) {
					x.delete();
					BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(x));
					bs.write(imagebytes);
					bs.close();
				} else {
					BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(x));
					bs.write(imagebytes);
					bs.close();
				}
			}
			Thread.sleep(5000);
		} catch (Exception e) {

		}	}	

	@RequestMapping("/admin/product")
	public String productPage(Model m) 
	{
		m.addAttribute("title","Flower Paradise -Product");
		m.addAttribute("editMode", false);
		m.addAttribute("listcategory", categoryDAO.listCategories());
		m.addAttribute("listproduct", productDAO.listproduct());
		m.addAttribute("productModel", new Product());
		m.addAttribute("productPage", true);
		m.addAttribute("haserror", false);
		m.addAttribute("productdisplay",true);
		m.addAttribute("showoneproduct",true);
		return "index";
	}

	@RequestMapping(value = "/admin/addproduct", method = RequestMethod.POST)
	public String add(@Valid @ModelAttribute("productModel") Product product, BindingResult br, Model m) 
	{
		if (br.hasErrors())
		{
			System.out.println("in error" + br.toString());
			m.addAttribute("title","Flower Paradise -Product");

			m.addAttribute("editMode", false);
			m.addAttribute("listcategory", categoryDAO.listCategories());
			m.addAttribute("listproduct", productDAO.listproduct());
			m.addAttribute("productModel", product);
			m.addAttribute("productPage", true);
			m.addAttribute("haserror", true);
			m.addAttribute("error", "please check your data");
			return "index";
		} 
		else
		{

			try 
			{
				System.out.println("in try");
				productDAO.add(product);
				m.addAttribute("title","Flower Paradise -Product");

				addimage(product.getPimage(),product.getProductId());
				return "redirect:/admin/product";
			} 
			catch (Exception e) {
				m.addAttribute("editMode", false);
				m.addAttribute("title","Flower Paradise -Product");

				m.addAttribute("listcategory", categoryDAO.listCategories());
				m.addAttribute("listproduct", productDAO.listproduct());
				m.addAttribute("productModel", product);
				m.addAttribute("productPage", true);
				m.addAttribute("haserror", true);
				m.addAttribute("error", " data already present");
				return "index";
			}
		}
	}
	@RequestMapping("/showoneproduct")
	public String showoneproductPage(@RequestParam("productName") String productName, Model m)
	{
		m.addAttribute("title","Flower Paradise -Description");
		m.addAttribute("productModel", productDAO.getProduct(productName));
		m.addAttribute("showoneproductPage",true);
		return "index";
	}
	
	@RequestMapping("/admin/deleteproduct")
	public String deleteproduct(@RequestParam("productName") String productName, Model m)
	{
		Product p = productDAO.getProduct(productName);
		m.addAttribute("title","Flower Paradise -Product");

		productDAO.delete(p);
		return "redirect:/admin/product";
	}

	@RequestMapping("/admin/editProduct")
	public String editProduct(@RequestParam("productName") String productName, Model m) 
	{
		m.addAttribute("editMode", true);
		m.addAttribute("title","Flower Paradise -Product");

		m.addAttribute("listcategory", categoryDAO.listCategories());
		m.addAttribute("listproduct", productDAO.listproduct());
		m.addAttribute("productModel", productDAO.getProduct(productName));
		m.addAttribute("productPage", true);
		m.addAttribute("haserror", true);
		m.addAttribute("error", " ");
		return "index";
	}
	
	
	@RequestMapping("/productdisplay")
	public String productdisplayPage(Model m) 
	{
		m.addAttribute("title","Flower Paradise -Display");
		m.addAttribute("listproduct", productDAO.listproduct());
		m.addAttribute("productdisplayPage",true);
		return "index";
	}


	@RequestMapping(value = "/admin/updateproduct", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("productModel") Product product, BindingResult br, Model m)
	{
		if (br.hasErrors())
		{
			m.addAttribute("editMode", false);
			m.addAttribute("title","Flower Paradise -Product");

			m.addAttribute("listcategory", categoryDAO.listCategories());
			m.addAttribute("listproduct", productDAO.listproduct());
			m.addAttribute("productModel", product);
			m.addAttribute("productPage", true);
			m.addAttribute("haserror", true);
			m.addAttribute("error", "please check your data");
			return "index";
		}
		else
		{
			try {
				productDAO.update(product);

				addimage(product.getPimage(), product.getProductId());
				return "redirect:/admin/product";
				}
			catch (Exception e)
			{
				m.addAttribute("editMode", false);
				m.addAttribute("title","Flower Paradise -Product");

				m.addAttribute("listcategory", categoryDAO.listCategories());
				m.addAttribute("listproduct", productDAO.listproduct());
				m.addAttribute("productModel", product);
				m.addAttribute("productPage", true);
				m.addAttribute("haserror", true);
				m.addAttribute("error", " data already present");
				return "index";

			}
		}
	}
}