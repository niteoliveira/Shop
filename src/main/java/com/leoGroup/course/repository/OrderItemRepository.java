package com.leoGroup.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoGroup.course.entities.OrderItem;
import com.leoGroup.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}