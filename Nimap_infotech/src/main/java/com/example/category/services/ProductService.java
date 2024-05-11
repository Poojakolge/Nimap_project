package com.example.category.services;

import java.util.List;

import com.example.category.Category;


public interface ProductService {
	List<Category> getAllProduct();
	Category getCategoryById(Long id);
	Category createCategory(Category product);
	Category updateCategory(Category product);
	Category deleteCategory(Long id);

	List<Category> findAll();

	
	

}
