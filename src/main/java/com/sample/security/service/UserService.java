package com.sample.security.service;

import java.util.Set;

import com.sample.security.model.User;

public interface UserService {

	public User getUser(Integer userId);

	public Set<User> findAllUsers();

}
