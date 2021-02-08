package com.sci.technology.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sci.technology.dto.SciUserDTO;
import com.sci.technology.entity.SciUser;

public interface UserService extends UserDetailsService {
	 SciUser findByEmail(String email);

	 SciUser save(SciUserDTO userRegistration);
}
