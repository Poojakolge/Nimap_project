package com.example.category.services;

import java.util.List;

import com.example.category.Category;

public interface CategoryService {
	List<Category> getAllCategory();
	Category getCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Category category);
    Category deleteCategory(Long id);
    

	default List<Category> findAll() {
        // TODO: Implement the method logic to retrieve all categories
        return null; // For now, return null, replace with actual implementation
    }



	
	

}
