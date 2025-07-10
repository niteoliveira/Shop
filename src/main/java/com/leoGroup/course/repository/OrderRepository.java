package com.leoGroup.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoGroup.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
