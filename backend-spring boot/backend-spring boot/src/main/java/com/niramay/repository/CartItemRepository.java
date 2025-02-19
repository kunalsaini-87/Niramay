package com.niramay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niramay.model.Cart;
import com.niramay.model.CartItem;
import com.niramay.model.Product;
import com.niramay.model.User;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
