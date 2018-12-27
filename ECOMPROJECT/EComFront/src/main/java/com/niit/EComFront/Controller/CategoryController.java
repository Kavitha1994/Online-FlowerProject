package com.niit.EComFront.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.EComBack.dao.CategoryDAO;
import com.niit.EComBack.model.Category;

@Controller
public class CategoryController {
	@Autowired
	CategoryDAO categoryDAO;

	@RequestMapping("/admin/category")
	public String categoryPage(Model m) {
		m.addAttribute("title", "Flower Paradise -Category");
		m.addAttribute("category", new Category());
		m.addAttribute("catlist", categoryDAO.listCategories());

		m.addAttribute("categoryPage", true);
		m.addAttribute("haserror", false);
		m.addAttribute("editMode", false);

		return "index";
	}

	@RequestMapping(value = "/admin/add", method = RequestMethod.POST)
	public String add(@Valid @ModelAttribute("category") Category category, BindingResult br, Model m) {

		if (br.hasErrors()) {
			m.addAttribute("editMode", false);
			m.addAttribute("title", "Flower Paradise -Category");

			m.addAttribute("category", category);
			m.addAttribute("catlist", categoryDAO.listCategories());
			m.addAttribute("categoryPage", true);
			m.addAttribute("haserror", true);
			m.addAttribute("error", "please check your data");
			return "index";
		} else {

			try {
				categoryDAO.add(category);
				m.addAttribute("title", "Flower Paradise -Category");

				return "redirect:/admin/category";
			} catch (Exception e) {
				m.addAttribute("title", "Flower Paradise -Category");

				m.addAttribute("editMode", false);

				m.addAttribute("category", category);
				m.addAttribute("catlist", categoryDAO.listCategories());
				m.addAttribute("categoryPage", true);
				m.addAttribute("haserror", true);
				m.addAttribute("error", "Data already present");
				return "index";
			}
		}
	}

	@RequestMapping("/admin/deletecategory")
	public String deletecategory(@RequestParam("categoryName") String categoryName, Model m) {
		Category c = categoryDAO.getCategory(categoryName);
		categoryDAO.delete(c);
		return "redirect:/admin/category";
	}

	@RequestMapping("/admin/editCategory")
	public String editCategory(@RequestParam("categoryName") String categoryName, Model m) {
		m.addAttribute("editMode", true);
		m.addAttribute("title", "Flower Paradise -Category");

		m.addAttribute("category", categoryDAO.getCategory(categoryName));
		m.addAttribute("catlist", categoryDAO.listCategories());
		m.addAttribute("categoryPage", true);
		m.addAttribute("haserror", false);
		m.addAttribute("error", "");

		return "index";

	}

	@RequestMapping(value = "/admin/update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("category") Category category, BindingResult br, Model m) {

		if (br.hasErrors()) {
			m.addAttribute("title", "Flower Paradise -Category");

			m.addAttribute("editMode", false);
			m.addAttribute("category", category);
			m.addAttribute("catlist", categoryDAO.listCategories());
			m.addAttribute("categoryPage", true);
			m.addAttribute("haserror", true);
			m.addAttribute("error", "please check your data");
			return "index";
		} else {

			try {
				categoryDAO.update(category);
				return "redirect:/admin/category";
			} catch (Exception e) {
				m.addAttribute("editMode", false);
				m.addAttribute("title", "Flower Paradise -Category");

				m.addAttribute("category", category);
				m.addAttribute("catlist", categoryDAO.listCategories());
				m.addAttribute("categoryPage", true);
				m.addAttribute("haserror", true);
				m.addAttribute("error", "Data already present");
				return "index";
			}
		}
	}

}
