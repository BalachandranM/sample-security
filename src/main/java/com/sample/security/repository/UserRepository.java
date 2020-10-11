package com.sample.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.security.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
