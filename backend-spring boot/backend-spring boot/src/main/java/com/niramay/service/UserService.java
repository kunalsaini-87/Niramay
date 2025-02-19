package com.niramay.service;

import java.util.List;

import com.niramay.exception.UserException;
import com.niramay.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
