package com.sample.security.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.sample.security.entity.User;
import com.sample.security.repository.UserRepository;
import com.sample.security.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepo;

	public com.sample.security.model.User getUser(Integer userId) {
		com.sample.security.model.User user = null;
		if (Objects.nonNull(userId)) {
			Optional<User> userEo = userRepo.findById(userId);
			if (userEo.isPresent()) {
				user = new com.sample.security.model.User(userEo.get());
			}
		}
		return user;
	}

	public Set<com.sample.security.model.User> findAllUsers() {
		Set<com.sample.security.model.User> users = new HashSet<>();
		List<User> userEos = userRepo.findAll();
		if (!CollectionUtils.isEmpty(userEos)) {
			users = userEos.parallelStream().map(com.sample.security.model.User::new).collect(Collectors.toSet());
		}
		return users;
	}

}
