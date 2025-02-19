package com.niramay.service;


import com.niramay.exception.OrderException;
import com.niramay.model.OrderItem;
import com.niramay.model.Product;

public interface OrderItemService {

	OrderItem getOrderItemById(Long id) throws Exception;
	


}
