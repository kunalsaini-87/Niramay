package com.niramay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niramay.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
