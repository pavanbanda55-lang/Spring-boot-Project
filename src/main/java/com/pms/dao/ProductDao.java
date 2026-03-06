package com.pms.dao;

import java.util.List;
import com.pms.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pms.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository repo;
	public List<Product> getProduct(){
		return repo.findAll();
	}

}
