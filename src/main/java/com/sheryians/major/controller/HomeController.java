package com.sheryians.major.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sheryians.major.global.GlobalData;
import com.sheryians.major.service.CategoryService;
import com.sheryians.major.service.ProductService;

@Controller
public class HomeController {
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	@GetMapping({"/" , "/home"})
	public String home(Model model) {
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "index";
	}
	
	@GetMapping("/AllProducts")
	public String allProducts(Model model) {
		model.addAttribute("categories", categoryService.getAllCategory());
		model.addAttribute("products", productService.getAllProducts());
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "AllProducts";
	}
	
	@GetMapping("/AllProducts/category/{id}")
	public String productsByCategory(Model model, @PathVariable int id) {
		
		//int sourceID=getId("football");
		model.addAttribute("categories", categoryService.getAllCategory());
		model.addAttribute("products", productService.getAllProductsByCategoryId(id));
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "AllProducts";
	}
	
	/*
	 * private int getId(String argString) {
	 * if(argString.equalsIgnoreCase("football")) return 2;
	 * 
	 * }
	 */

	@GetMapping("/AllProducts/viewproduct/{id}")
	public String viewProductDetails(Model model, @PathVariable int id) {
		model.addAttribute("product", productService.getProductById(id).get());
		model.addAttribute("cartCount", GlobalData.cart.size());
		return "product-details";
	}
}