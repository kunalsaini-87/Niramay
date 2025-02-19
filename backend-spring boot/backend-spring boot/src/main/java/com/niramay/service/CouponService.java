package com.niramay.service;

import java.util.List;
import java.util.Optional;

import com.niramay.model.Cart;
import com.niramay.model.Coupon;
import com.niramay.model.User;

public interface CouponService {
    Cart applyCoupon(String code, double orderValue, User user) throws Exception;
    Cart removeCoupon(String code, User user) throws Exception;
    Coupon createCoupon(Coupon coupon);
    void deleteCoupon(Long couponId);
    List<Coupon> getAllCoupons();
    
    Coupon getCouponById(Long couponId);
}
