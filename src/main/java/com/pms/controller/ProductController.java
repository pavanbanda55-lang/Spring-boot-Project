package com.pms.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pms.model.Product;
import com.pms.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService service;
	
	@GetMapping("/getproduct")
	public List<Product> getProduct(){
		return service.getProduct();
	}
}
