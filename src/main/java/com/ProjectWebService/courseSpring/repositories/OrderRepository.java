package com.ProjectWebService.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectWebService.courseSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}