package com.treADMile.caseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treADMile.caseStudy.DTO.User;

public interface UserRepo extends JpaRepository<User, Long>{
	 public User findByUserIdAndUserPassword(long userId, String userPassword);
}
