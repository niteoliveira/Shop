package com.leoGroup.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoGroup.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
