package com.example.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.category.Category;
import com.example.category.services.CategoryService;



@RestController
@RequestMapping("/api/categories")
public class categoryController {
		
	    @Autowired
	    private final CategoryService categoryService;

		public categoryController(CategoryService categoryServices) {
			super();
			this.categoryService = categoryServices;
		}
	    
	    

		@GetMapping("/categoryees")
	    public List<Category> getAllAdmins() {
	        List<Category> category = categoryService.getAllCategory();
	        return category;
		}
		
		@GetMapping("/{id}")
	    public ResponseEntity<Category> getCategoryById(@PathVariable("id") Long id) {
	        Category category = categoryService.getCategoryById(id);
	        return ResponseEntity.ok(category);
	    }

	    @PostMapping
	    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
	        Category createdCategory = categoryService.createCategory(category);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdCategory);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Category> updateCategory(@PathVariable("id") Long id, @RequestBody Category category) {
	        Category updatedCategory = categoryService.updateCategory(category);
	        if (updatedCategory != null) {
	            return ResponseEntity.ok(updatedCategory);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCategory(@PathVariable("id") Long id) {
	        categoryService.deleteCategory(id);
	        return ResponseEntity.noContent().build();
	    }
		
}


