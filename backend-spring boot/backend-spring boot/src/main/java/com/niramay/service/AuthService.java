package com.niramay.service;

import com.niramay.exception.SellerException;
import com.niramay.exception.UserException;
import com.niramay.request.LoginRequest;
import com.niramay.request.ResetPasswordRequest;
import com.niramay.request.SignupRequest;
import com.niramay.response.ApiResponse;
import com.niramay.response.AuthResponse;

import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
