package com.pms.service;

import java.util.List;

import com.pms.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.dao.ProductDao;

@Service
public class ProductService {
	@Autowired
	ProductDao dao;
	public List<Product> getProduct(){
		return dao.getProduct();
	}

}
