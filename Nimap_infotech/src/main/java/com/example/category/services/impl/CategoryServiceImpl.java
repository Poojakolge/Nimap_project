package com.example.category.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.category.Category;
import com.example.category.services.CategoryService;
import com.example.category.repository.CategoryRepository;

@Service
public abstract class CategoryServiceImpl implements CategoryService{

	private CategoryRepository categoryRepository;
	
	
	
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}



	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}
	
	@Override
    public List<Category> findAll() {
        return getAllCategory(); // In this example, we delegate to the getAllCategory() method
    }

}
