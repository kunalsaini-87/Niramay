package com.niramay.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.niramay.exception.CartItemException;
import com.niramay.exception.UserException;
import com.niramay.model.CartItem;
import com.niramay.model.User;
import com.niramay.response.ApiResponse;
import com.niramay.service.CartItemService;
import com.niramay.service.UserService;

@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {

	private CartItemService cartItemService;
	private UserService userService;
	
	public CartItemController(CartItemService cartItemService, UserService userService) {
		this.cartItemService=cartItemService;
		this.userService=userService;
	}
	

}
