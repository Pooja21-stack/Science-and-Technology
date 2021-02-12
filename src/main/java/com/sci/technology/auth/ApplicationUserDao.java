package com.sci.technology.auth;

import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public interface ApplicationUserDao {
	Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
