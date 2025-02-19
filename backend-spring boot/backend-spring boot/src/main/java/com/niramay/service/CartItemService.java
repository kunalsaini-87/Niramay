package com.niramay.service;

import com.niramay.exception.CartItemException;
import com.niramay.exception.UserException;
import com.niramay.model.Cart;
import com.niramay.model.CartItem;
import com.niramay.model.Product;


public interface CartItemService {
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
