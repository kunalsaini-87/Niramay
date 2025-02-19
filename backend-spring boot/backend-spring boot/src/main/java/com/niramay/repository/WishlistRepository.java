package com.niramay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niramay.model.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
    Wishlist findByUserId(Long userId);
}
