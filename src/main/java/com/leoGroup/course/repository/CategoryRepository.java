package com.leoGroup.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoGroup.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
