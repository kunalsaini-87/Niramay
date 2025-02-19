package com.niramay.service;


import java.util.Optional;

import com.niramay.exception.WishlistNotFoundException;
import com.niramay.model.Product;
import com.niramay.model.User;
import com.niramay.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

