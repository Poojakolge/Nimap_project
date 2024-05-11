package com.example.category.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.category.Category;
import com.example.category.services.ProductService;
import com.example.category.repository.ProductRepository;

@Service

public class ProductServiceImpl implements ProductService{

	private ProductRepository productRepository;
	
	
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}



	@Override
	public List<Category> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	
	@Override
    public List<Category> findAll() {
        return getAllProduct(); // In this example, we delegate to the getAllCategory() method
    }



	@Override
	public Category getCategoryById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Category createCategory(Category product) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Category updateCategory(Category product) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Category deleteCategory(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
