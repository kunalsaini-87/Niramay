package com.niramay.service;

import javax.naming.AuthenticationException;

import com.niramay.exception.ReviewNotFoundException;
import com.niramay.model.Product;
import com.niramay.model.Review;
import com.niramay.model.User;
import com.niramay.request.CreateReviewRequest;

import java.util.List;

public interface ReviewService {

    Review createReview(CreateReviewRequest req,
                        User user,
                        Product product);

    List<Review> getReviewsByProductId(Long productId);

    Review updateReview(Long reviewId,
                        String reviewText,
                        double rating,
                        Long userId) throws ReviewNotFoundException, AuthenticationException;


    void deleteReview(Long reviewId, Long userId) throws ReviewNotFoundException, AuthenticationException;

}
