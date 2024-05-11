package com.example.category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")

public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
   
    private Long id;
    
    @Column(name = "full_name")
    private String name;
    
    public Product() {
    	
    }
    
    
    public Product(String name) {
		super();
		this.name = name;
	}
	// Constructors, getters, and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    

}
