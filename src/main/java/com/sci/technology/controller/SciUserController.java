package com.sci.technology.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sci.technology.dto.SciUserDTO;

@RestController
@RequestMapping("api/v1/users")
public class SciUserController {
	private static final List<SciUserDTO> USERS = Arrays.asList();

	@GetMapping(path = "{id}")
	public SciUserDTO getStudent(@PathVariable("id") Integer id) {
		return USERS.stream().filter(user -> id.equals(user.getId())).findFirst()
				.orElseThrow(() -> new IllegalStateException("Student " + id + " does not exist."));
	}

	@GetMapping
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
	public List<SciUserDTO> getAllUsers() {
		return USERS;
	}

}
