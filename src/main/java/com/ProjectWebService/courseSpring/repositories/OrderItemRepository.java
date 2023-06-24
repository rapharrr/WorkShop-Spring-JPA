package com.ProjectWebService.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectWebService.courseSpring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    
}
