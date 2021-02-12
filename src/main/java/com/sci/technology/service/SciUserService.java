package com.sci.technology.service;

import com.sci.technology.dto.SciUserRegistrationDTO;
import com.sci.technology.entity.SciUser;

public interface SciUserService {
	SciUser save(SciUserRegistrationDTO sciUserRegistrationDTO);

}
