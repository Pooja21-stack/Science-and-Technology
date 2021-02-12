package com.sci.technology.service;

import org.springframework.stereotype.Service;

import com.sci.technology.dto.SciUserRegistrationDTO;
import com.sci.technology.entity.SciUser;
import com.sci.technology.repository.SciUserRepository;

@Service
public class SciUserServiceImpl implements SciUserService {

	
	private SciUserRepository sciUserRepository;
	
	public SciUserServiceImpl(SciUserRepository sciUserRepository) {
		super();
		this.sciUserRepository = sciUserRepository;
	}

	@Override
	public SciUser save(SciUserRegistrationDTO sciUserRegistrationDTO) {
		SciUser sciUser = new SciUser(sciUserRegistrationDTO.getFirstName(),sciUserRegistrationDTO.getMiddleName(),sciUserRegistrationDTO.getLastName(),sciUserRegistrationDTO.getContact(),sciUserRegistrationDTO.getEmail(),sciUserRegistrationDTO.getPassword(),sciUserRegistrationDTO.getAddress(),sciUserRegistrationDTO.getImage());
		return sciUserRepository.save(sciUser);
	}

}
