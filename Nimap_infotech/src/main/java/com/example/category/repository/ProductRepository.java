package com.example.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.category.Category;



@Repository

public interface ProductRepository extends JpaRepository<Category, Long> {

}
