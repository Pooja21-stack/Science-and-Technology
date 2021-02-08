package com.sci.technology.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sci.technology.entity.SciUser;

public interface UserRepository extends JpaRepository < SciUser, Long >{

	 SciUser findByEmail(String email);
}
