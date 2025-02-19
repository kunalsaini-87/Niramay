package com.niramay.service;

import com.niramay.exception.ProductException;
import com.niramay.model.Cart;
import com.niramay.model.CartItem;
import com.niramay.model.Product;
import com.niramay.model.User;
import com.niramay.request.AddItemRequest;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
