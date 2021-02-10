package com.sci.technology.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class SciUserTypeDTO extends BaseEntityDTO {
	@Column(nullable = false)
	private String userType;

	@Column(nullable = false)
	private SciDesignationDTO sciDesignationDTO;

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public SciDesignationDTO getSciDesignationDTO() {
		return sciDesignationDTO;
	}

	public void setSciDesignationDTO(SciDesignationDTO sciDesignationDTO) {
		this.sciDesignationDTO = sciDesignationDTO;
	}
}
