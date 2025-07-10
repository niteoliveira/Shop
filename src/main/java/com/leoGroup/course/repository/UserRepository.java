package com.leoGroup.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoGroup.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
