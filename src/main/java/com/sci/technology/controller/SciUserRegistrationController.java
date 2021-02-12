package com.sci.technology.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sci.technology.dto.SciUserRegistrationDTO;
import com.sci.technology.service.SciUserService;

@Controller
@RequestMapping("/registration")
public class SciUserRegistrationController {

	private SciUserService sciUserService;

	public SciUserRegistrationController() {
		super();
	}


	public SciUserRegistrationController(SciUserService sciUserService) {
		super();
		this.sciUserService = sciUserService;
	}


	@ModelAttribute("user")
	public SciUserRegistrationDTO sciUserRegistrationDTO() {
		return new SciUserRegistrationDTO();

	}

	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") SciUserRegistrationDTO sciUserRegistrationDTO) {
		sciUserService.save(sciUserRegistrationDTO);
		return "redirect:/registration?success";
	}

}
