package com.ProjectWebService.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjectWebService.courseSpring.entities.OrderItem;
import com.ProjectWebService.courseSpring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

    
}
