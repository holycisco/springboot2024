package com.example.mcdonalds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mcdonalds.model.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
